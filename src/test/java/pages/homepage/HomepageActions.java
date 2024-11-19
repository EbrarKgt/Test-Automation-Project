package pages.homepage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static pages.homepage.HomepageSelector.*;
public class HomepageActions extends BasePage {

    public HomepageActions(WebDriver driver) {
        super(driver);
    }

    public void slideRightSlider(){
        clickElement(driver.findElement(RIGHT_SLIDER_ARROW));
    }

    public void slideLeftSlider(){
        clickElement(driver.findElement(LEFT_SLIDER_ARROW));
    }

    public void clickWomenCategory(){
        clickElement(driver.findElement(CATEGORY_WOMEN));
    }

    public void clickMenCategory(){
        clickElement(driver.findElement(CATEGORY_MEN));
    }

    public void clickKidsCategory(){
        clickElement(driver.findElement(CATEGORY_KIDS));
    }

    public void clickPoloBrand(){
        clickElement(driver.findElement(BRAND_POLO));
    }

    public void clickHMBrand(){
        clickElement(driver.findElement(BRAND_HM));
    }

    public String getPoloBrandCount(){
        return driver.findElement(BRAND_POLO_COUNT).getText().replaceAll("[^0-9]", "");
    }

    public int getProductCardsCount(){
        return driver.findElements(PRODUCTS).size();
    }
}
