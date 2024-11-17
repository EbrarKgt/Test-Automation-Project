package pages.homepage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static pages.homepage.Selector.*;

public class Checks extends BasePage {

    public Checks(WebDriver driver) {
        super(driver);
    }

    public void SliderRightArrowCheck(){
        isElementVisible(driver.findElement(RIGHT_SLIDER_ARROW));
    }

    public void SliderLeftArrowCheck(){
        isElementVisible(driver.findElement(LEFT_SLIDER_ARROW));
    }

}
