package SauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filter {
    @Test
    public  void finish_checkout(){
        WebDriver driver;
        String baseUrl="https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        //apply chrome driver setup
        //open login page
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        String LoginPageAssert= driver.findElement(By.xpath("//*[@id='root']/div/div[1]")).getText();
        //input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //click login
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //add to cart
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
        //click cart
        driver.findElement(By.xpath("//*[@id=\'shopping_cart_container\']")).click();
        //click Checkout
        driver.findElement(By.xpath("//*[@id=\'checkout\']")).click();
        //fill information & finish checkout
        driver.findElement(By.id("first-name")).sendKeys("Fania");
        driver.findElement(By.id("last-name")).sendKeys("Hania");
        driver.findElement(By.id("postal-code")).sendKeys("14230");
        driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
        driver.findElement(By.xpath("//*[@id=\'finish\']")).click();
        driver.findElement(By.xpath("//*[@id=\'back-to-products\']")).click();
        //Test filter
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select")).click();
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select")).click();
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select")).click();
        driver.findElement(By.xpath("//*[@id=\'header_container\']/div[2]/div/span/select/option[4]")).click();


    }
}
