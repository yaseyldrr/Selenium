package Day11;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_Ornek extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        WebElement btn1 = driver.findElement(By.id("btn1"));
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        // bu locator görünür olana kadar bekle

        WebElement txt1 = driver.findElement(By.id("txt1")); // burada verecek element yok zaten
        txt1.sendKeys("yase");

        // TODO: Buton 2 yi yapın.
        WebElement btn2 = driver.findElement(By.id("btn2"));
        btn2.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        // bu locator görünür olana kadar bekle

        WebElement txt2 = driver.findElement(By.id("txt2"));
        txt2.sendKeys("yldrr");

        tearDown();
    }
}
