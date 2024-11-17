package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Denemeler01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://www.amazon.com.tr/");
//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("nutella");
//        searchBox.submit();
//        WebElement result = driver.findElement(By.xpath("//div[@class = 'a-section a-spacing-small a-spacing-top-small']"));
//        System.out.println(result.getText());
//        driver.close();

//        driver.get("https://www.facebook.com/?locale=tr_TR");
//        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
//        emailBox.sendKeys("sjdskd");
//        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
//        passwordBox.sendKeys("sjdskd");
//        driver.findElement(By.xpath("//button[@name='login']")).click();
//        WebElement result = driver.findElement(By.xpath("//div[@class = 'fsl fwb fcb']"));
//        String expected = "Giriş Bilgileri Yanlış";
//        if (expected.equals(result.getText())) {
//            System.out.println("başarısız giriş testi passed");
//        } else {
//            System.out.println("başarısız giriş testi failed");
//        }
//        driver.close();

        // 1- https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");

        // 3- sayfada kac adet button bulundugunu yazdirin
        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println(buttonList.size());

        // 4- sayfadaki herbir button uzerindeki yazilari yazdirin

        for (WebElement each : buttonList
        ) {
            System.out.println(each.getText());

        }

    }
}
