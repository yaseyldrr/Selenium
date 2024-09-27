package Day09;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);
        MyFunc.bekle(2);

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        // 1. Yöntem : oslo'yu al norway'e bırak
        // Hızlı olduğu için site cevap veremeyebilir.
        actions.dragAndDrop(oslo,norway).build().perform();

        // 2. Yöntem
        // Daha sağlıklı çalışıyor.
        actions.clickAndHold(oslo).build().perform(); // eline al
        actions.moveToElement(norway).release().perform(); // git ve bırak
    }
}
