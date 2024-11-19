package pages.homepage;
import org.openqa.selenium.By;

public class HomepageSelector {

    public static final By SLIDER_XPATH = By.xpath("//*[@id='slider-carousel']");
    public static final By RIGHT_SLIDER_ARROW = By.xpath("//*[@id=\"slider-carousel\"]/a[2]");
    public static final By LEFT_SLIDER_ARROW = By.xpath("//*[@id=\"slider-carousel\"]/a[1]");
    public static final By CATEGORY_WOMEN = By.xpath("//a[@href = '#Women']");
    public static final By CATEGORY_MEN = By.xpath("//a[@href = '#Men']");
    public static final By CATEGORY_KIDS = By.xpath("//a[@href = '#Kids']");
    public static final By BRAND_POLO = By.xpath("//a[text()='Polo']");
    public static final By BRAND_POLO_COUNT = By.xpath("//a[text()='Polo']/span[@class='pull-right']");
    public static final By BRAND_HM = By.xpath("//a[text()='H&M']");
    public static final By BRAND_HM_COUNT = By.xpath("//a[text()='H&M']/span[@class='pull-right']");
    public static final By BRAND_MADAME = By.xpath("//a[text()='Madame']");
    public static final By BRAND_MADAME_COUNT = By.xpath("//a[text()='Madame']/span[@class='pull-right']");
    public static final By BRAND_MAST_AND_HARBOUR = By.xpath("//a[text()='Mast & Harbour']");
    public static final By BRAND_MAST_AND_HARBOUR_COUNT = By.xpath("//a[text()='Mast & Harbour']/span[@class='pull-right']");
    public static final By BRAND_BABYHUG = By.xpath("//a[text()='Babyhug']");
    public static final By BRAND_BABYHUG_COUNT = By.xpath("//a[text()='Babyhug']/span[@class='pull-right']");
    public static final By BRAND_ALLEN = By.xpath("//a[text()='Allen Solly Junior']");
    public static final By BRAND_ALLEN_COUNT = By.xpath("//a[text()='Allen Solly Junior']/span[@class='pull-right']");
    public static final By BRAND_KOOKIE = By.xpath("//a[text()='Kookie Kids']");
    public static final By BRAND_KOOKIE_COUNT = By.xpath("//a[text()='Kookie Kids']/span[@class='pull-right']");
    public static final By BRAND_BIBA = By.xpath("//a[text()='Biba']");
    public static final By BRAND_BIBA_COUNT = By.xpath("//a[text()='Biba']/span[@class='pull-right']");
    public static final By PRODUCTS = By.xpath("//div[@class='col-sm-4']");

}
