package Day05;

import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test; // Buna Unit test denir

public class _04_Navigating extends BaseDriver{
    @Test
    public void Test1()
    {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // siteye git aç
        MyFunc.bekle(2);

        WebElement link = driver.findElement(By.id("alerttest"));
        link.click();
        MyFunc.bekle(1);

        driver.navigate().back(); // bir geri sayfaya git
        MyFunc.bekle(1);

        driver.navigate().forward(); // bir ileri sayfaya git
        //if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alert-test.html"))
            //System.out.println("Test Passed.");
        //else
           //System.out.println("Test failed.");

        Assert.assertTrue("Beklenen sayfaya ulaşılamadı ",driver.getCurrentUrl().equals("1https://testpages.eviltester.com/styled/alerts/alert-test.html"));
        // Ben true bekliyorum, değilse göster, yoksa test passed
        tearDown();
    }
}
