package pages.products;

import org.openqa.selenium.By;

public class ProductSelector {

     public static final By PRODUCT_SEARCH_BOX = By.xpath("//input[@id='search_product']");
     public static final By SEARCH_BUTTON = By.xpath("//button[@id='submit_search']");
    public static final By SEARCHED_INFO = By.xpath("//h2[text()='Searched Products']");

}
