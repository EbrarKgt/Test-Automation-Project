package pages.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;


import java.util.List;

import static pages.homepage.HomepageSelector.*;

public class HomepageActions extends BasePage {

    public HomepageActions(WebDriver driver) {
        super(driver);
    }

    public void slideRightSlider() {
        clickElement(driver.findElement(RIGHT_SLIDER_ARROW));
    }

    public void slideLeftSlider() {
        clickElement(driver.findElement(LEFT_SLIDER_ARROW));
    }

    public void clickWomenCategory() {
        clickElement(driver.findElement(CATEGORY_WOMEN));
    }

    public void clickMenCategory() {
        clickElement(driver.findElement(CATEGORY_MEN));
    }

    public void clickKidsCategory() {
        clickElement(driver.findElement(CATEGORY_KIDS));
    }

    public void clickEachBrand(String brand) {
        switch (brand) {
            case "Polo":
                clickElement(driver.findElement(BRAND_POLO));
                break;
            case "H&M":
                clickElement(driver.findElement(BRAND_HM));
                break;
            case "Madame":
                clickElement(driver.findElement(BRAND_MADAME));
                break;
            case "Mast & Harbour":
                clickElement(driver.findElement(BRAND_MAST_AND_HARBOUR));
                break;
            case "Babyhug":
                clickElement(driver.findElement(BRAND_BABYHUG));
                break;
            case "Allen Solly Junior":
                clickElement(driver.findElement(BRAND_ALLEN));
                break;
            case "Kookie Kids":
                clickElement(driver.findElement(BRAND_KOOKIE));
                break;
            case "Biba":
                clickElement(driver.findElement(BRAND_BIBA));
                break;
            default:
                throw new IllegalArgumentException("Invalid brand name: " + brand);
        }
    }

    public String getEachBrandCount(String brand) {
        switch (brand) {
            case "Polo":
                return driver.findElement(BRAND_POLO_COUNT).getText().replaceAll("[^0-9]", "");
            case "H&M":
                return driver.findElement(BRAND_HM_COUNT).getText().replaceAll("[^0-9]", "");
            case "Madame":
                return driver.findElement(BRAND_MADAME_COUNT).getText().replaceAll("[^0-9]", "");
            case "Mast & Harbour":
                return driver.findElement(BRAND_MAST_AND_HARBOUR_COUNT).getText().replaceAll("[^0-9]", "");
            case "Babyhug":
                return driver.findElement(BRAND_BABYHUG_COUNT).getText().replaceAll("[^0-9]", "");
            case "Allen Solly Junior":
                return driver.findElement(BRAND_ALLEN_COUNT).getText().replaceAll("[^0-9]", "");
            case "Kookie Kids":
                return driver.findElement(BRAND_KOOKIE_COUNT).getText().replaceAll("[^0-9]", "");
            case "Biba":
                return driver.findElement(BRAND_BIBA_COUNT).getText().replaceAll("[^0-9]", "");
            default:
                throw new IllegalArgumentException("Invalid brand name: " + brand);
        }
    }

    public int getProductCardsCount() {
        return driver.findElements(PRODUCTS).size();
    }

    public void clickViewProductButton(){
        List<WebElement> viewProductButtons = driver.findElements(VIEW_PRODUCTS);
        clickElement(viewProductButtons.get(0));
    }
}
