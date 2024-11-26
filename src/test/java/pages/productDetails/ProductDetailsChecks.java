package pages.productDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

import static pages.productDetails.ProductDetailsSelector.*;

public class ProductDetailsChecks extends BasePage {
    public ProductDetailsChecks(WebDriver driver) {
        super(driver);
    }

    public boolean CheckAddToCartButtonClickability() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(ADD_TO_CART_BUTTON));
        return addToCartButton.isDisplayed();
    }
}
