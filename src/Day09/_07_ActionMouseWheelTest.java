package Day09;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionMouseWheelTest extends BaseDriver {
    @Test
    public void Test1() { // elemente kadaar kaydır
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.bekle(2);

        WebElement iFrame = driver.findElement(By.name("nested_scrolling_frame"));

        new Actions(driver)
                .scrollToElement(iFrame) // iFrame isimli elemente kadar scroll
                .build()
                .perform();

        tearDown();
    }
    @Test
    public void Test2() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.bekle(2);

        new Actions(driver)
                .scrollByAmount(0,600)// verilen pixel miktarı kadar scroll yap
                .build()
                .perform();
        tearDown();
    }

}
