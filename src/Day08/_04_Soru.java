package Day08;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseDriver {
    @Test
    public void Test1() {
        // Test Senaryosu
        // 1- https://www.facebook.com/  sayfasına gidiniz
        // 2- CreateNewAccount a tıklatınız.
        // 3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
        // 4- Doğum tarihinizi Select sınıfı ile seçiniz

        driver.get("https://www.facebook.com/");

        WebElement name = driver.findElement(By.id("u_a_8_Bg"));
        name.sendKeys("yase");
        MyFunc.bekle(1);

        WebElement surname = driver.findElement(By.id("u_a_a_qs"));
        name.sendKeys("yldrr");
        MyFunc.bekle(1);

        WebElement phone = driver.findElement(By.id("u_a_d_ZD"));
        name.sendKeys("424242424242");
        MyFunc.bekle(1);

        WebElement day = driver.findElement(By.id("day"));
        Select dddMenu = new Select(day);
        dddMenu.selectByIndex(3);

        WebElement month = driver.findElement(By.id("month"));
        Select mddMenu = new Select(month);
        mddMenu.selectByIndex(3);

        WebElement year = driver.findElement(By.cssSelector("value="));
        Select ddMenu = new Select(year);
        ddMenu.selectByIndex(3);



        tearDown();
    }
}
