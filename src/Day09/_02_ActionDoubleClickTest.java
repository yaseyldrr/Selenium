package Day09;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/buttons");

        //WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        WebElement rightClickBtn = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));

        // 1. Yöntem
        Actions actions = new Actions(driver);
        Action aksiyon = actions.moveToElement(rightClickBtn).contextClick().build();
        aksiyon.perform();

        // 2. Yöntem
        //new Actions(driver).doubleClick(btnDblClick).build().perform();

        tearDown();
    }
}
