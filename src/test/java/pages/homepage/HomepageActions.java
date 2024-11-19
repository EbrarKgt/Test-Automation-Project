package pages.homepage;

import org.openqa.selenium.WebDriver;
import pages.BasePage;


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

//    public void clickPoloBrand(){
//        clickElement(driver.findElement(BRAND_POLO));
//    }
//
//    public String getPoloBrandCount(){
//        return driver.findElement(BRAND_POLO_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickHMBrand(){
//        clickElement(driver.findElement(BRAND_HM));
//    }
//
//    public String getHMBrandCount(){
//        return driver.findElement(BRAND_HM_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickMadameBrand(){
//        clickElement(driver.findElement(BRAND_MADAME));
//    }
//
//    public String getMADAMEBrandCount(){
//        return driver.findElement(BRAND_MADAME_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickMastAndHarbourBrand(){
//        clickElement(driver.findElement(BRAND_MAST_AND_HARBOUR));
//    }
//
//    public String getMastAndHarbourBrandCount(){
//        return driver.findElement(BRAND_MAST_AND_HARBOUR_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickBabyHugBrand(){
//        clickElement(driver.findElement(BRAND_BABYHUG));
//    }
//
//    public String getBabyHugBrandCount(){
//        return driver.findElement(BRAND_BABYHUG_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickAllenBrand(){
//        clickElement(driver.findElement(BRAND_ALLEN));
//    }
//
//    public String getAllenBrandCount(){
//        return driver.findElement(BRAND_ALLEN_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickKookieBrand(){
//        clickElement(driver.findElement(BRAND_KOOKIE));
//    }
//
//    public String getKookieBrandCount(){
//        return driver.findElement(BRAND_KOOKIE_COUNT).getText().replaceAll("[^0-9]", "");
//    }
//
//    public void clickBibaBrand(){
//        clickElement(driver.findElement(BRAND_BIBA));
//    }
//
//    public String getBibaBrandCount(){
//        return driver.findElement(BRAND_BIBA_COUNT).getText().replaceAll("[^0-9]", "");
//    }

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

}
