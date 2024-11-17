package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.homepage.Actions;
import pages.homepage.Checks;

import java.time.Duration;

public class CheckSliderArrowsFunction {

    //This class ..

    private Actions actions;
    private Checks checks;
    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        checks = new Checks(driver);
        actions = new Actions(driver);
        driver.get("http://automationexercise.com");

    }


    @After
    public void close(){
        driver.close();
    }


    @Test
    public void SliderArrowsCheck(){
        checks.SliderRightArrowCheck();
        checks.SliderLeftArrowCheck();
    }

    @Test
    public void ProductCountCheck(){
        int poloBrandProductCount = Integer.parseInt(actions.getPoloBrandCount());
        actions.clickPoloBrand();
        int displayedProducts = (actions.getProductCardsCount()) -1;
        Assert.assertEquals(poloBrandProductCount, displayedProducts);
    }
}

//Brand - Polo Products başlık kontrolü