package trials;


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Akın extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://shopdemo.fatfreeshop.com/?");

        MyFunc.bekle(2);

        WebElement demoBook = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        demoBook.click();

        MyFunc.bekle(1);
        driver.switchTo().frame(driver.findElement(By.className("EJIframeV3")));

        WebElement card= driver.findElement(By.xpath("//button[@data-option='CC']"));
        card.click();
        MyFunc.bekle(1);

//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='position: absolute; top: -2000px; left: 0px']")));

        WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("technostudyTeam8@gmail.com");
        MyFunc.bekle(2);
        WebElement confirmemail=driver.findElement(By.xpath("//input[@placeholder='Confirm Email']"));
        confirmemail.sendKeys("technostudyTeam8@gmail.com");
        MyFunc.bekle(1);
        WebElement kartIsmi=driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        kartIsmi.sendKeys("Ronaldo");
        MyFunc.bekle(1);
        List<WebElement> optional=driver.findElements(By.xpath("//input[@placeholder='Optional']"));
        WebElement phone= optional.get(0);
        phone.sendKeys("+33169857885");
        MyFunc.bekle(1);
        WebElement company=optional.get(1);
        company.sendKeys("Realmadrid");
        MyFunc.bekle(1);

        WebElement textarea= driver.findElement(By.xpath("//textarea[@placeholder='Optional']"));
        textarea.sendKeys("Thank you for everything");

        driver.switchTo().frame(1);
        WebElement kartnumarasi=driver.findElement(By.xpath("//input[@placeholder='Kart numarası']"));
        kartnumarasi.sendKeys("4242 4242 4242 4242");
        WebElement date=driver.findElement(By.xpath("//input[@placeholder='AA / YY']"));
        date.sendKeys("12/24");

        WebElement cvc=driver.findElement(By.xpath("//input[@placeholder='CVC']"));
        cvc.sendKeys("000");
        driver.switchTo().parentFrame();
        WebElement pay= driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        pay.click();

        wait.until(ExpectedConditions.titleContains("Thank you"));
        // wait.until(ExpectedConditions.urlToBe("https://www.fatfreecartpro.com/ecom/rp.php?rdffc=truetrue&txn_id=st-ch_3Q3GwQFWSmRjvnlt24U0WeWp&payer_email=technostudyteam8%40gmail.com&client_id=341695&c_id=201282604&c_enc=cb3a14e271b89b5bf01c95b91a31afd5&cart_metadata=%7B%22gtag%22%3A%7B%22gtag%22%3A%22UA-273877-2%22%2C%22_ga%22%3Anull%7D%2C%22cart_source%22%3A%22https%3A%2F%2Fshopdemo.fatfreeshop.com%2F%22%7D&firstLoad=true&&pending_reason=&gajs=&auser=&abeacon=&"));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[text()=' your order is confirmed. Thank you!']"))));

        WebElement text= driver.findElement(By.xpath("//*[text()='confirmed']"));
        Assert.assertTrue("Failed",text.getText().contains("order"));

        BekleKapat();
    }
}
