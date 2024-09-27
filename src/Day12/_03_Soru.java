package Day12;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class  _03_Soru extends BaseDriver {
    @Test
    public void Test1() {
        // SENARYO:
        // Sayfasına gidiniz.
        // 1-Sayfada PlaceHolder yazısını elementin gettextinden yazdırınız
        // 2-Ekrandaki checkBox çekleyiniz.
        // 3-Sayfadaki First row yazısını elementtin Gettext i ile yazdırınız
        // 4-Sayfadaki IFrame Above  yazısını elementin Gettext i ile yazdırınız

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        WebElement plchldr = driver.findElement(By.xpath("/html/body/div[1]"));
        System.out.println("plchldr.getText() = " + plchldr.getText());
        MyFunc.bekle(2);

        WebElement IFrame = driver.findElement(By.xpath("//iframe"));
        new Actions(driver)
                .scrollToElement(IFrame).build().perform();
        MyFunc.bekle(2);

        driver.switchTo().frame(IFrame);

        WebElement checkBox = driver.findElement(By.xpath("/html/body/input"));
        checkBox.click();
        MyFunc.bekle(2);

        WebElement frow = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[1]/td"));
        System.out.println("frow.getText() = " + frow.getText());
        MyFunc.bekle(2);

        driver.switchTo().parentFrame();

        WebElement IFrameAbove = driver.findElement(By.xpath("/html/body/footer"));
        System.out.println("IFrameAbove.getText() = " + IFrameAbove.getText());

        Assert.assertTrue("Failed",IFrameAbove.getText().equals("IFrame Above"));

        tearDown();

    }
}