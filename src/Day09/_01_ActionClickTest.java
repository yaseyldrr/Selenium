package Day09;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class _01_ActionClickTest extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/buttons");

        WebElement btnClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //btnClick().click();
        Actions aksiyonlar = new Actions(driver); // Web sayfası aksiyonlara açıldı.


        //Action aksiyon = aksiyonlar.moveToElement(btnClick).click().build();
        // elementin üzerine click için git orda bekle, aksiyonu hazırla
        MyFunc.bekle(2);
        //aksiyon.perform();

        // kısa hali
        aksiyonlar.moveToElement(btnClick).click().build().perform();

        // daha kısa hali
        //new Actions(driver).moveToElement(btnClick).click().build().perform();

        // en kısa hali
        //new Actions(driver).click(btnClick).build().perform();


        tearDown();
    }
}
