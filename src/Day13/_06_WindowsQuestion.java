package Day13;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _06_WindowsQuestion extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        String anaSafyaId=driver.getWindowHandle();

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement e: linkler) {

            if (e.getAttribute("href").equalsIgnoreCase("https://kiwiirc.com/nextclient/irc.libera.chat/#selenium"))
                continue;

            js.executeScript("arguments[0].click();", e);
            System.out.println("e.getAttribute = " + e.getAttribute("href"));
        }
        MyFunc.Bekle(2);

        Set<String> tabIdler=driver.getWindowHandles();
        for(String id: tabIdler){
            driver.switchTo().window(id);
            System.out.println(driver.getTitle()+" - "+driver.getCurrentUrl());
        }

        for(String id: tabIdler){
            if (id.equals(anaSafyaId)) continue; // ana sayfa ise pas geç

            driver.switchTo().window(id);

            driver.close(); //sadece bulunduğu tab ı kapatır
        }

        MyFunc.Bekle(2);
        BekleKapat();
    }



}
