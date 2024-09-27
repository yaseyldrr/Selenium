package Day11;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_ImplicitlyWait extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement btn = driver.findElement(By.xpath("//*[@id='post-body-7708391096228750161']/button"));
        btn.click();

        WebElement msj = driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        tearDown();
    }
}
