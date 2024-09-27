package Day08;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass  extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        // bu element eğer SELECT tag ile başlayan bir web elementi ise
        // bu Select nesnesine CAST yap ve öyle kullan.


        // elementi daha kuallanılabilir SELECT nesnesi haline dönüştürdü
        Select ddMenu = new Select(webMenu);

        ddMenu.selectByIndex(4);
        MyFunc.bekle(2);
        ddMenu.selectByValue("search-alias=grocery");
        MyFunc.bekle(2);
        ddMenu.selectByVisibleText("Elektronik");
        MyFunc.bekle(2);

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        for (WebElement e : ddMenu.getOptions()){
            System.out.println("Seçenek : " + e.getText());
        }

        tearDown();





    }
}
