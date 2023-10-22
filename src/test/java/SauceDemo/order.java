package SauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class order {
    @Test
    public  void add_cart(){
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

        driver.findElement(By.id("first-name")).sendKeys("Fania");


    }
}
