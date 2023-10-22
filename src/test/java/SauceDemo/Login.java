package SauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    @Test
public  void success_login(){
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

        }
        @Test
        public void failed_login(){
                WebDriver driver;
                String baseUrl="https://www.saucedemo.com/";

                WebDriverManager.chromedriver().setup();

                //apply chrome driver setup
                //open login page
                driver=new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.get(baseUrl);
                String LoginPageAssert= driver.findElement(By.xpath("//*[@id='root']/div/div[1]")).getText();
                //input email
                driver.findElement(By.id("user-name")).sendKeys("standard_user");
                //input password
                driver.findElement(By.id("password")).sendKeys("secret_sauc");
                //click login
                driver.findElement(By.xpath("//input[@type='submit']")).click();
//assert error message
                String errorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
                Assert.assertEquals(errorLogin, "Epic sadface: Username and password do not match any user in this service");

                driver.close();
        }
}
