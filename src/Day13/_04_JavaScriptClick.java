package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _04_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement takeTest=driver.findElement(By.xpath("//div[text()='Take Testing Quiz']"));
        //takeTest.click();  // sayfa önünden mouse click

        //js.executeScript("arguments[0].click();", takeTest);: Bu komut, JavaScript kullanarak tıklama işlemini gerçekleştirir.
        // Normal WebDriver click() metodu bazı durumlarda çalışmayabilir (örneğin, sayfada başka elementler tıklamayı engelliyorsa).
        // Bu şekilde doğrudan DOM üzerinde JavaScript ile tıklama yapılır.

        js.executeScript("arguments[0].click();", takeTest);// js click : sayfanın içinden click

        BekleKapat();
    }
}
