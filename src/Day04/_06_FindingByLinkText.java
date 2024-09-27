package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        // id -> By.id
        // name -> By.name
        // class -> By.classname
        // linktext -> By.linktext (SADECE a tagli elemanlar için kullanılır)
        // partiallinktext -> By.partiallinktext (SADECE a tagli elemanlar için kullanılır)

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki = driver.findElement(By.linkText("Siparişlerim"));
        // link görünen texti Siparişlerim olan a tag li ELEMANI bul
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        // partialLinkText: Linkin görünen yazsının kısmını selector olarak kullanabilirsiniz.
        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText = " + link2.getText());

        MyFunc.bekle(3);
        driver.quit(); // bu driver üzerinden açılmış bütün tarayıcıları kapatır
        // driver.close(); // bu driver üzerinden açılmış o anda aktif olan tarayıcıyı kapat.
    }
}
