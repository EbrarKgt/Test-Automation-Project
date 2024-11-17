package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class Denemeler02 {

//Test Case 4: Logout User FOR test01
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter correct email address and password
//7. Click 'login' button
//8. Verify that 'Logged in as username' is visible
//9. Click 'Logout' button
//10. Verify that user is navigated to login page


//Test Case 9: Search Product FOR test02
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Products' button
//5. Verify user is navigated to ALL PRODUCTS page successfully
//6. Enter product name in search input and click search button
//7. Verify 'SEARCHED PRODUCTS' is visible
//8. Verify all the products related to search are visible


//Test Case 1: Register User FOR test03
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @After
    public void close(){
        driver.close();
    }


    @Test
    public void test01(){
        driver.get("http://automationexercise.com");
        WebElement homePageVerify = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(homePageVerify.isDisplayed());
        WebElement signing = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signing.click();
        WebElement loginVerify = driver.findElement(By.xpath("//h2[text()='Login to your account']"));  //taglara dikkat
        Assert.assertTrue(loginVerify.isDisplayed());
        WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
        email.sendKeys("k@new.com");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
        password.sendKeys("12345");
        driver.findElement(By.xpath("//button[@data-qa = 'login-button']")).click();
        WebElement sigendUserVerify = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        Assert.assertTrue(sigendUserVerify.isDisplayed());
        WebElement logOut = driver.findElement(By.xpath("//a[text() = ' Logout']"));
        logOut.click();
        String expectedUrl = "https://automationexercise.com/login";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }

    @Test
    public void test02(){
        driver.get("http://automationexercise.com");
        WebElement homePageVerify = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(homePageVerify.isDisplayed());
        driver.findElement(By.xpath("//a[text()= ' Products']")).click();
        WebElement allProductsVerify = driver.findElement(By.xpath("//h2[text()= 'All Products']"));
        Assert.assertTrue(allProductsVerify.isDisplayed());
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_product']"));
        searchBox.sendKeys("tshirt");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        WebElement searchedVerify = driver.findElement(By.xpath("//h2[text()='Searched Products']"));
        Assert.assertTrue(searchedVerify.isDisplayed());
    }

    @Test
    public void test03(){
        driver.get("http://automationexercise.com");
        WebElement homePageVerify = driver.findElement(By.xpath("//img[@src = '/static/images/home/logo.png']"));
        Assert.assertTrue(homePageVerify.isDisplayed());
        WebElement signing = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        signing.click();
        WebElement registerVerify = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(registerVerify.isDisplayed());
        WebElement name = driver.findElement(By.xpath("//input[@name = 'name']"));
        name.sendKeys("kk");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB)
                .sendKeys("k2@new.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        WebElement registerPageVerify = driver.findElement(By.xpath("//b[text()= 'Enter Account Information']"));
        Assert.assertTrue(registerPageVerify.isDisplayed());
        WebElement titleRadioButton= driver.findElement(By.xpath("//input[@id='id_gender2']"));
        actions.click(titleRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("3")
                .sendKeys(Keys.TAB)
                .sendKeys("M")
                .sendKeys(Keys.TAB)
                .sendKeys("22")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys("kk")
                .sendKeys(Keys.TAB)
                .sendKeys("oo")
                .sendKeys(Keys.TAB)
                .sendKeys("kendim")
                .sendKeys(Keys.TAB)
                .sendKeys("cs")
                .sendKeys(Keys.TAB)
                .sendKeys("ev")
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Teksas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("4343")
                .sendKeys(Keys.TAB)
                .sendKeys("5454534")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        String expectedYazi="ACCOUNT CREATED!";
        String actualYazi=driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        Assert.assertEquals(expectedYazi,actualYazi);





    }
}
