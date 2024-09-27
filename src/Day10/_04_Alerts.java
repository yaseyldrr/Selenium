package Day10;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Alerts extends BaseDriver {
    //Interview da sormuşlar
    //-- Alertleri nasıl kontrol edersin.
    //
    //driver.switchTo().alert() -> alert kutuca geçiş yap (web sayfasından)
    //
    //komutlar:
    //1- accept : OK, TAMAM butonuna basmamızı sağlar
    //2- dismiss: CANCEL, HAYIR butonuna basmamızı sağlar
    //3- sendKeys : yazı gönderme
    //4- getText : alertin yazısını alma
    //
    //driver.switchTo().alert().accept();
    //driver.switchTo().alert().dismiss();
    //driver.switchTo().alert().sendKeys();
    //driver.switchTo().alert().getText();
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);
        WebElement clickMe = driver.findElement(By.id("alert"));
        clickMe.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().accept(); // Kabul et, OK'a bas

        //WebElement prompt = driver.findElement(By.id("prompt"));
        //prompt.click();
        //MyFunc.bekle(2);
        //driver.switchTo().alert().dismiss();


        //WebElement txtMessage = driver.findElement(By.id("text"));
        //Assert.assertTrue("Failed",txtMessage.getText().endsWith("null"));
        //new Actions(driver).scrollToElement(txtMessage).build().perform();
        //MyFunc.bekle(2);

        WebElement doublePrompt = driver.findElement(By.id("double-prompt"));
        doublePrompt.click();
        MyFunc.bekle(2);
        driver.switchTo().alert().sendKeys("yase");
        driver.switchTo().alert().accept();

        tearDown();
    }
}
