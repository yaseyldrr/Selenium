package Project;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/

public class Assignment_01 extends BaseDriver{
    @Test
    public void test(){
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.bekle(1);

        WebElement email = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.bekle(1);

        WebElement currentAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.bekle(1);

        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress-wrapper > div:nth-child(2)>textarea:nth-child(1)"));
        permanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.bekle(1);

        WebElement submitButton = driver.findElement(By.cssSelector(".text-right > button:nth-child(1)"));
        submitButton.click();
        MyFunc.bekle(1);

        WebElement str1 = driver.findElement(By.id("name"));
        String name = str1.getText();
        if (name.contains("Automation"))
            System.out.println("Passed");
        else
            System.out.println("failed");

        WebElement str2 = driver.findElement(By.id("email"));
        String mail = str2.getText();
        if (mail.contains("Testing"))
            System.out.println("Passed");
        else
            System.out.println("failed");

        driver.quit();
    }
}