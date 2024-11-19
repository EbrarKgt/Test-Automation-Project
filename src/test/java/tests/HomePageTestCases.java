package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.homepage.HomepageActions;
import pages.homepage.HomepageChecks;

import java.time.Duration;

public class HomePageTestCases {

    private HomepageActions homepageActions;
    private HomepageChecks homepageChecks;
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homepageChecks = new HomepageChecks(driver);
        homepageActions = new HomepageActions(driver);
        driver.get("https://automationexercise.com/");
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelectorAll('iframe, .ad, [id*=\"ad\"], [class*=\"ad\"]').forEach(el => el.style.display = 'none');"
        );

    }


    @After
    public void close() {
        driver.close();
    }


    @Test
    public void SliderArrowsCheck() {
        homepageChecks.SliderRightArrowCheck();
        homepageChecks.SliderLeftArrowCheck();
    }

    @Test
    public void EachProductCountCheck() {
        String[] brands = {"Polo", "H&M", "Madame", "Mast & Harbour", "Babyhug", "Allen Solly Junior", "Kookie Kids", "Biba"};
        for (String brand : brands) {
            int expectedBrandCount = Integer.parseInt(homepageActions.getEachBrandCount(brand));
            homepageActions.clickEachBrand(brand);
            int displayedProducts = (homepageActions.getProductCardsCount()) - 1;
            System.out.println("Brand: " + brand);
            System.out.println("Expected Product Count: " + expectedBrandCount);
            System.out.println("Displayed Product Count: " + displayedProducts);
            System.out.println("--------------------------------------------");
            Assert.assertEquals(expectedBrandCount, displayedProducts);
        }
    }
}