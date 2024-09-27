package Day04;


import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        // # ile id lerde ara demek
        // . koyarsan cass larda ara demek

        WebDriver tarayici = new ChromeDriver();
        tarayici.get("https://form.jotform.com/221934510376353");

        // Locator birden fazla eleman varsa ilkini bulur
        WebElement element = tarayici.findElement(By.className("form-sub-label"));
        System.out.println(element.getText());

        // Birden fazla element bulma
        List<WebElement> elements = tarayici.findElements(By.className("form-sub-label"));
        for (WebElement e : elements)
            System.out.println(e.getText());

        System.out.println(elements.size());
        MyFunc.bekle(3);
        tarayici.quit();
    }
}
