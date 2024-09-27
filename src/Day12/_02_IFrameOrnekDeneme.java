package Day12;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class _02_IFrameOrnekDeneme extends BaseDriver {
    @Test
    public void Test1() {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://demoqa.com/nestedframes");

        driver1.switchTo().frame(0);  // dışdaki frame in içine girildi
        driver1.switchTo().frame(0);  // içerdeki frame geçildi.

        WebElement lblYazi = driver1.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println("lblYazi.getText() = " + lblYazi.getText());

        driver1.switchTo().parentFrame();  // bir geri gelmiş olurum, dışardaki frame in içindeyim.
        System.out.println(driver1.getPageSource()); // bulunduğum sayfanın html kodlarını yazdır

        driver1.switchTo().parentFrame(); // anasayfaya gittim
        //driver.switchTo().defaultContent();// anayasayfaya gitmenin diğer yolu

        WebElement anaSayfaBaslik = driver1.findElement(By.xpath("//h1[text()='Nested Frames']"));
        System.out.println("anaSayfaBaslik.getText() = " + anaSayfaBaslik.getText());

        tearDown();
    }
}
