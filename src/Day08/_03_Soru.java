package Day08;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {
    @Test
    public void Test1() {
        // Test Senaryosu
        // 1- https://www.ebay.co.uk/  sayfasına gidiniz
        // 2- Kategorilerden Baby seçeneğini seçiniz.
        // 3- Arama butonuna tıklatınız.
        // 4- Sonuçları çıktığı ekranda sol başlık
        // kısmında Baby kelimesinin geçtiğini doğrulayınız

        driver.get("https://www.ebay.co.uk/");

        WebElement ddBox = driver.findElement(By.id("gh-cat"));

        Select ddMenu = new Select(ddBox);
        ddMenu.selectByIndex(3);

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        MyFunc.bekle(2);

        WebElement text = driver.findElement(By.className("b-pageheader__text"));
        String check = text.getText();
        Assert.assertEquals("failed", "Baby Essentials", check);


        tearDown();
    }
}
