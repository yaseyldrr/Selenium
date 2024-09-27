package Project;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// # id
// . class
public class Assignment_02 extends BaseDriver{

    //1) Bu siteye gidin. -> https://demo.applitools.com/
    //
    //2) Username kısmına "ttechno@gmail.com" girin.
    //
    //3) Password kısmına "techno123." girin.
    //
    //4) "Sign in" buttonunan tıklayınız.
    //
    //5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
    @Test
    public void Test1(){
        driver.navigate().to("https://demo.applitools.com/");
        MyFunc.bekle(2);

        WebElement username = driver.findElement(By.cssSelector("[placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.bekle(2);

        WebElement password = driver.findElement(By.cssSelector("[placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        MyFunc.bekle(2);

        WebElement signInButton = driver.findElement(By.cssSelector(".buttons-w > a:nth-child(1)"));
        signInButton.click();
        MyFunc.bekle(2);


        WebElement text = driver.findElement(By.cssSelector("[style='text-align: center;font-size: x-large;color:red']"));
        Assert.assertTrue(text.getText().contains("Your nearest branch closes in: 30m 5s"));

        MyFunc.bekle(2);
        driver.quit();
    }
}
