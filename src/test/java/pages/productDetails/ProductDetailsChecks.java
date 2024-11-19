package pages.productDetails;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import static pages.productDetails.ProductDetailsSelector.*;

public class ProductDetailsChecks extends BasePage {
    public ProductDetailsChecks(WebDriver driver) {
        super(driver);
    }

    public void AddToChartCheck(){
        isElementVisible(driver.findElement(ADD_TO_CART_BUTTON));
    }

}
