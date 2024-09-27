package Project;
import Utility.MyFunc;
import org.junit.Test;
import Day05.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Assignment_04 extends BaseDriver {

    //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    //
    //Calculate'e tıklayınız.
    //
    //    İlk input'a herhangi bir sayı giriniz.
    //
    //    İkinci input'a herhangi bir sayı giriniz.
    //
    //Calculate button'una tıklayınız.
    //
    //Sonucu alınız.
    //
    //Sonucu yazdırınız.

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculator = driver.findElement(By.cssSelector("a[href^=calculator]"));
        calculator.click();
        MyFunc.bekle(1);

        WebElement input1 = driver.findElement(By.cssSelector(".form-label > input:nth-child(1)"));
        input1.sendKeys("5");
        MyFunc.bekle(1);

        WebElement input2 = driver.findElement(By.cssSelector(".form-label > input:nth-child(3)"));
        input2.sendKeys("10");
        MyFunc.bekle(1);

        WebElement calculateButton = driver.findElement(By.cssSelector("[value='Calculate']"));
        calculateButton.click();
        MyFunc.bekle(1);

        //WebElement result = driver.findElement(By.cssSelector())

    }

}
