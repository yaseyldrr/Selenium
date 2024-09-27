package Day09;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_ActionContextClickTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/buttons");

        WebElement btnDblClick = driver.findElement(By.id("doubleClickBtn"));

    }
}
