package Day11;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class _04_Ornek extends BaseDriver {
    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
    @Test
    public void Test1() {
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement smsng = driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a"));
        smsng.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tbodyid']/div[2]/div/a")));
        WebElement card = driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a"));
        card.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        WebElement main = driver.findElement(By.id("nava"));
        main.click();

        tearDown();
    }
}
