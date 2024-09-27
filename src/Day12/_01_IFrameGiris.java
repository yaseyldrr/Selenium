package Day12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        //önce ilgili WebElemntin bulunduğu iframe e geçmem lazım
        // id=singleframe, name=singleframe,  index =0, WebElement olarak

        driver.switchTo().frame(0);  //indexi ni vererek geçebilirsin
//        driver.switchTo().frame("singleframe"); // id sini verrek de geçebilirsin
//        driver.switchTo().frame("singleframe"); // name ini verrek de geçebilirsin
//
//        WebElement iframe1=driver.findElement(By.id("singleframe"));
//        driver.switchTo().frame(iframe1);  // WebElemnt haline getirip öyle de geçebilirsin

        WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
        txtBox.sendKeys("Merhaba");
        // bu noktada hangi sayfadayım: iframe in içindeyim
        // peki Ana sayfaya nasıl geri dönebilirim ?
        //1.yol : 1 geri git parente git,
        driver.switchTo().parentFrame(); // 1 adım geri olan sayfaya git

        //2.Yol : direk olarak AnaSayfaya git
        driver.switchTo().defaultContent(); // direk ana sayfaya git.
        // bu noktada ANA sayfadayım

        BekleKapat();
    }
}
