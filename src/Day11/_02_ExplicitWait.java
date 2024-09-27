package Day11;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        WebElement btn = driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button"));
        btn.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(20)); // 20 sn en fazla
        bekle.until(ExpectedConditions.textToBe(By.id("demo"), "WebDriver"));
        // id si demo olan webelementin görünen yazısı "WebDriver" olana kadar bekle (20 sn)


        WebElement demo = driver.findElement(By.id("demo"));
        System.out.println("demo.getText() = " + demo.getText());

        tearDown();
    }
}
