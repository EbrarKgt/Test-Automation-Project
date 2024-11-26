package pages.productDetails;

import org.openqa.selenium.By;

public class ProductDetailsSelector {

    public static final By PRODUCT_NAME = By.xpath("//div[@class='product-information']//h2");
    public static final By CATEGORY_NAME = By.xpath("//div[@class='product-information']//p[contains(text(), 'Category:')]");
    public static final By PRICE = By.xpath("//span[contains(text(), 'Rs.')]");

//    public static final By QUANTITY_NUMBER = By.xpath("//input[@id='quantity']");
//    public static final By QUANTITY_BUTTON = By.xpath("//input[@name='product_id']");
    public static final By ADD_TO_CART_BUTTON = By.xpath("//button[@class='btn btn-default cart']");
    public static final By AVAILABILITY = By.xpath("//p[b[text()='Availability:']]");
    public static final By CONDITION = By.xpath("//p[b[text()='Condition:']]");
    public static final By BRAND = By.xpath("//p[b[text()='Brand:']]");
    public static final By PRODUCT_IMAGE = By.className(".view-product");
    public static final By NAME_FOR_REVIEW = By.xpath("//input[@id = 'name']");
    public static final By EMAIL_FOR_REVIEW = By.xpath("//input[@id = 'email']");
    public static final By TEXT_AREA = By.xpath("//textarea[@name = 'review']");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@id = 'button-review']");
}
