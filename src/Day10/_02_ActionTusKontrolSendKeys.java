package Day10;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void TEst1() {
        driver.get("https://demoqa.com/auto-complete");
        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();


        MyFunc.bekle(2);

        new Actions(driver)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        tearDown();
    }
}
