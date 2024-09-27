package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindByName {
    public static void main(String[] args) {
        // By.Name()
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "ismet" yazdırınız
        // 3-  soyad kutucuğuna "temur" yazdırınız

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");
        tarayici.manage().window().maximize(); // Ekranı max yapar

        WebElement isimKutusu = tarayici.findElement(By.name("q8_name[first]")); // id si first_8 olan elementi bul
        isimKutusu.sendKeys("Emir"); // Web elemente verilen yazıtı yaz

        WebElement soyisimKutusu = tarayici.findElement(By.name("q8_name[last]"));
        soyisimKutusu.sendKeys("Yıldırır");

        WebElement btnSubmit = tarayici.findElement(By.id("input_2"));
        btnSubmit.click();

        MyFunc.bekle(3);
        tarayici.quit();
    }
}
