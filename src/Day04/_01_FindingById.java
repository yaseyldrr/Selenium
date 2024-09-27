package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        // Senaryo:
        // 1-Bu sayfaya git
        // 2-İsim kutucuğuna "yase" yazdırınız
        // 3-Soyadı kutucuğuna "yldrr" yazdırınız


        // id = firts_8

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");

        // int sayi = 8;
        WebElement isimKutusu = tarayici.findElement(By.id("first_8")); // id si first_8 olan elementi bul
        isimKutusu.sendKeys("Yasemin"); // Web elemente verilen yazıtı yaz

        WebElement soyisimKutusu = tarayici.findElement(By.id("last_8"));
        soyisimKutusu.sendKeys("Yıldırır");

        MyFunc.bekle(3);
        tarayici.quit();
    }
}
