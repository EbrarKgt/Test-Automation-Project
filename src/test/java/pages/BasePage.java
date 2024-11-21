package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickElement(WebElement element) {
        //wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        //wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
        element.sendKeys(text);
    }

    public boolean isElementVisible(WebElement element) {
        try {
            //wait.until(ExpectedConditions.visibilityOf(element));
            element.isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void hideAds() {
        ((JavascriptExecutor) driver).executeScript(
                "document.querySelectorAll('iframe, .ad, [id*=\"ad\"], [class*=\"ad\"]').forEach(el => el.style.display = 'none');"
        );
    }


}
