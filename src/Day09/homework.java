package Day09;

import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class homework extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        MyFunc.bekle(1);

        List<WebElement> cities = new ArrayList<>();
        List<WebElement> countries = new ArrayList<>();

        Actions actions = new Actions(driver);

        String a = "a";
        String q = "q";
        int sayi = 1;

        for (int i = 1; i < 16; i++) {
            WebElement city = driver.findElement(By.id(a + sayi++));
            cities.add(city);
        }
        sayi = 1;
        for (int i = 1; i < 16; i++) {
            WebElement country = driver.findElement(By.id(q + sayi++));
            countries.add(country);
        }

        for (int i = 0; i < cities.size(); i++) {
            WebElement city = cities.get(i);
            WebElement country = countries.get(i);
            actions.moveToElement(city).clickAndHold().perform();
            MyFunc.bekle(1);
            actions.release(country).perform();
        }
        tearDown();
    }
}
