package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_JavaScriptScroll extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.bekle(2);

        JavascriptExecutor js = (JavascriptExecutor) driver; // casting
        js.executeScript("window.scrollTo(0,300)"); // Baştan aşağı
        js.executeScript("window.scrollBy(0,-300)"); // Bulunduğu yerden yukarı

    }
}
