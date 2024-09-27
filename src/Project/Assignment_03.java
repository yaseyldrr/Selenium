package Project;
import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment_03 extends BaseDriver {

    //1) Bu siteye gidin. -> https://www.snapdeal.com/
    //
    //2) "teddy bear" aratın ve Search butonuna tıklayın.
    //
    //3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
    @Test
    public void Test1() {
        driver.get("https://www.snapdeal.com/");

        WebElement searchplcholder = driver.findElement(By.cssSelector("[placeholder= 'Search products & brands']"));
        searchplcholder.sendKeys("teddy bear");
        MyFunc.bekle(1);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class$=rippleGrey]")); //
        searchButton.click();
        MyFunc.bekle(1);

        WebElement text = driver.findElement(By.cssSelector("[style='color: #212121; font-weight: normal']"));
        Assert.assertTrue("Test failed!",text.getText().contains("We've got 63 results for teddy bear"));
        MyFunc.bekle(1);

        driver.quit();




    }
}
