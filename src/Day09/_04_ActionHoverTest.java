package Day09;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionHoverTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");
        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        Action action = actions.moveToElement(element).build();
        action.perform();

        tearDown();
    }
}
