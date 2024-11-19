package pages.productDetails;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static pages.productDetails.ProductDetailsSelector.*;

public class ProductDetailsActions extends BasePage {

    public ProductDetailsActions(WebDriver driver) {
        super(driver);
    }

    public void addToChart(){
        clickElement(driver.findElement(ADD_TO_CART_BUTTON));
    }

    public int getPrice(){
        return Integer.parseInt(driver.findElement(PRICE).getText());
    }

    public String getBrand(){
        return driver.findElement(BRAND).getText();
    }

    public String getCondition(){
        return driver.findElement(CONDITION).getText();
    }

    public String getAvailability(){
        return driver.findElement(AVAILABILITY).getText();
    }

}
