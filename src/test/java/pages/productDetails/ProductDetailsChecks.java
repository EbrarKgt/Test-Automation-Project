package pages.productDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

import static pages.productDetails.ProductDetailsSelector.*;

public class ProductDetailsChecks extends BasePage {
    public ProductDetailsChecks(WebDriver driver) {
        super(driver);
    }

    public void AddToChartButtonCheck() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ADD_TO_CART_BUTTON));
        System.out.println("Buton tıklanabilir durumda.");
    }

}
