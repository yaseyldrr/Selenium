package Day10;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_Soru extends BaseDriver{
    //    https://www.mediamarkt.com.tr/ sayfasına gidiniz.
    //    Tüm Kategoriler -> Beyaz Eşya -> Kombiler click
    //    tıklatma işleminden sonra URL de
    //    kombi kelimesinin geçtiğini doğrulayın.
    @Test
    public void Test1() {
        driver.get("https://www.mediamarkt.com.tr/");
        driver.manage().window().maximize();
        WebElement hamburger = driver.findElement(By.id("mms-app-header-category-button"));

        new Actions(driver)
                .click(hamburger)
                .build()
                .perform();
        MyFunc.bekle(2);

        WebElement beyazEsya = driver.findElement(By.id("category-197"));
        new Actions(driver)
                .moveToElement(beyazEsya)
                .click()
                .build()
                .perform();
        MyFunc.bekle(2);

        WebElement kombiler = driver.findElement(By.xpath("(//span[text()='Kombiler'])[1]")); //"(//span[text()='Kombiler'])[1]"
        new Actions(driver)
                .click(kombiler)
                .build()
                .perform();
        MyFunc.bekle(2);

        Assert.assertTrue("failed", driver.getCurrentUrl().contains("kombiler"));
        tearDown();
    }
}
