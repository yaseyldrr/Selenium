package Day10;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");
        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox) // kutucuğa git
                .click() // yazabilmek için tıklat
                .keyDown(Keys.SHIFT) // shift tuşuna bas
                .sendKeys("a") // a harfini gönder byük A yazmalı
                .keyUp(Keys.SHIFT) // shift tuşunu bırak
                .sendKeys("hmet") // hmet yazdır
                .build() // aksiyonu hazırla
                .perform(); // aksiyonu gerçekleştir

        tearDown();
    }
}
