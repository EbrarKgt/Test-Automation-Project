package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.homepage.HomepageActions;
import pages.homepage.HomepageChecks;

import java.time.Duration;

public class CheckSliderArrowsFunction {

    //This class ..

    private HomepageActions homepageActions;
    private HomepageChecks homepageChecks;
    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        homepageChecks = new HomepageChecks(driver);
        homepageActions = new HomepageActions(driver);
        driver.get("http://automationexercise.com");

    }


    @After
    public void close(){
        driver.close();
    }


    @Test
    public void SliderArrowsCheck(){
        homepageChecks.SliderRightArrowCheck();
        homepageChecks.SliderLeftArrowCheck();
    }

    @Test
    public void ProductCountCheck(){
        int poloBrandProductCount = Integer.parseInt(homepageActions.getPoloBrandCount());
        homepageActions.clickPoloBrand();
        int displayedProducts = (homepageActions.getProductCardsCount()) -1;
        Assert.assertEquals(poloBrandProductCount, displayedProducts);
    }
}

//Brand - Polo Products başlık kontrolü