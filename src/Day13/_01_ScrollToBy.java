package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_ScrollToBy extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.bekle(2);

        //Actions aksiyonlar=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver;  //driverdan bir tane JavaScript
                                                           // çalıştırıcısı oluşturdum.

        js.executeScript("window.scrollTo(0,500)"); // dikey yönde 500 px scroll yap
        MyFunc.bekle(2);

        js.executeScript("window.scrollBy(0,500)"); // bulunduğun yerden itibaren
                                                    // dikey yönde 500 px scroll yap

        MyFunc.bekle(2);
        js.executeScript("window.scrollBy(0,-500)"); // - yani bulunduğun yerden 500 geri gel

        BekleKapat();
    }

}
