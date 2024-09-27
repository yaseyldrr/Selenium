package Day13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

// tarayıcıdaki her bir sekmeye window adı veriliyor seleniumda
public class _05_WindowsIntro extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");

        // <a href="sayfa1.html" target="_blank">google.com</a>
        String anaSafyaId=driver.getWindowHandle();  // bulunduğum sayfanın id sini ver;

        List<WebElement> linkler = driver.findElements(By.xpath("//a[@target='_blank']"));

        for (WebElement e : linkler)
            js.executeScript("arguments[0].click();", e);

        Set<String> windowsIdLer = driver.getWindowHandles();
        for (String id: windowsIdLer)
            System.out.println("id = " + id);

        MyFunc.Bekle(2);
        //Ana sayfanın olduğu TAB a geç
        driver.switchTo().window(anaSafyaId);

        MyFunc.Bekle(5);
        BekleKapat();
    }

}
