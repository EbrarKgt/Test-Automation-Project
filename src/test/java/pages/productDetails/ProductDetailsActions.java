package pages.productDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

import static pages.productDetails.ProductDetailsSelector.*;

public class ProductDetailsActions extends BasePage {

    Actions actions = new Actions(driver);

    public ProductDetailsActions(WebDriver driver) {
        super(driver);
    }

    public void addToChart() {
        clickElement(driver.findElement(ADD_TO_CART_BUTTON));
    }

   /* public void incrementOfQuantity() {
        actions.moveToElement(driver.findElement(QUANTITY_NUMBER)).clickAndHold().perform();
    }

    public void decrementOfQuantity() {
        if (Integer.parseInt(driver.findElement(QUANTITY_NUMBER).getText()) > 1) {

        }
    }*/

    public int getPrice() {
        return Integer.parseInt(driver.findElement(PRICE).getText().replace("Rs. ","").trim());
    }

    public String getBrand() {
        return driver.findElement(BRAND).getText().replace("Brand: ", "").trim();
    }

    public String getCondition() {
        return driver.findElement(CONDITION).getText().replace("Condition:", "").trim();
    }

    public String getAvailability() {
        return driver.findElement(AVAILABILITY).getText().replace("Availability:", "").trim();
    }
}
