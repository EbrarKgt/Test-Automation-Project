package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.homepage.HomepageActions;
import pages.homepage.HomepageChecks;
import pages.productDetails.ProductDetailsActions;

import java.nio.file.Paths;
import java.time.Duration;

public class ProductDetailsTestCases {

    private HomepageActions homepageActions;
    private HomepageChecks homepageChecks;
    private WebDriver driver;
    private ProductDetailsActions productDetailsActions;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        String ublockPath = "src/uBlockOrigin.crx";
        options.addExtensions(Paths.get(ublockPath).toFile());

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homepageChecks = new HomepageChecks(driver);
        homepageActions = new HomepageActions(driver);
        productDetailsActions = new ProductDetailsActions(driver);
        driver.get("https://automationexercise.com/");
    }


    @After
    public void close() {
        driver.close();
    }


    @Test
    public void EachProductCountCheck() {
        String[] brands = {"Polo", "H&M", "Madame", "Mast & Harbour", "Babyhug", "Allen Solly Junior", "Kookie Kids", "Biba"};
        //homepageActions.hideAds();
        homepageActions.clickEachBrand(brands[0]);
        homepageActions.clickViewProductButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(productDetailsActions.getBrand(),brands[0]);
    }
}