package Day10;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Alerts extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.bekle(2);

        WebElement prompt = driver.findElement(By.id("prompt-with-default"));
        prompt.click();
        MyFunc.bekle(2);

        String text = driver.switchTo().alert().getText(); // prompttaki yazıyı al
        driver.switchTo().alert().accept();

        System.out.println("Text: " + text);
        Assert.assertTrue("Failed",text.contains("Enter"));

        tearDown();
    }
}
