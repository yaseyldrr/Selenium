package Day05;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        // link görünen texti Siparişlerim olan a tag li ELEMANI bul
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());
        // Bir web elementinin Attribute (özelliklerini) alma
        System.out.println("siparişlerinlinki.href" + siparislerimLinki.getAttribute("href"));
        System.out.println("siparişlerinlinki.title" + siparislerimLinki.getAttribute("title"));
        System.out.println("siparişlerinlinki.rel" + siparislerimLinki.getAttribute("rel"));


        MyFunc.bekle(3);
        driver.quit();
    }
}
