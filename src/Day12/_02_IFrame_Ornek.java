package Day12;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_IFrame_Ornek extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/nestedframes");

        //List<WebElement> cerezler = driver.findElements(By.xpath("//p[text()='Consent']"));
        //if (cerezler.size() > 0)
        //    cerezler.get(0).click();


        driver.switchTo().frame(0); // Nested frame dışardaki frame
        driver.switchTo().frame(0); // IFrame Demo, içerdeki frame

        WebElement lblYazi = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println("lblYazi.getText() = " + lblYazi.getText());

        driver.switchTo().parentFrame(); // bir geri gelmiş olurum, dışardaki frame deyim
        System.out.println("driver.getPageSource() = " + driver.getPageSource()); // bulunduğum sayfanın html kodlarını  yazdır

        driver.switchTo().parentFrame(); // anasayfaya gittim
        // driver.switchTo().defaultContent(); // diğer yol

        WebElement anaSayfaBaslık = driver.findElement(By.xpath("//h1[text()='Nested Frames']"));
        System.out.println("anaSayfaBaslık.getText() = " + anaSayfaBaslık.getText());

        tearDown();


    }
}
