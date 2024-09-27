package Day11;

import Day05.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class _05_Ornek extends BaseDriver {
    /*
    Senaryo:
    https://google.com/ da selenium kelimesini aratınız.
    ilk çıkan sonuca tıklatıp,(selenium)
    çıkan URL yi ekrana yazdırınız.
    Beklenen url https://www.selenium.dev/  olduğunu doğrulayınız
 */
    @Test
    public void Test1() {
        driver.get("https://google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Bulursan tıklat, bulamazsan geç (cookie)
        List<WebElement> acceptAll = driver.findElements(By.id("l2aglB"));
        if (acceptAll.size() > 0)
            acceptAll.get(0).click();


        WebElement google = driver.findElement(By.name("q"));
        google.sendKeys("selenium" + Keys.ENTER); // \ \r


        WebElement selenium = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        selenium.click();


        Assert.assertTrue("Failed",driver.getCurrentUrl().equals("https://www.selenium.dev/"));
    }
}
