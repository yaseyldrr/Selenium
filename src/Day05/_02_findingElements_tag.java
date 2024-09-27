package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_findingElements_tag {
    public static void main(String[] args) {
        // Amazon.com un sayfasındaki bütün linkleri istiyorum, tıklatılabilir ve görünen yazısı

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> linkler = driver.findElements(By.tagName("a")); // Bütün a olan tag li elementleri bul

        for (WebElement e : linkler){
            if (!e.getText().equals("") && e.getAttribute("href") != null) {

                System.out.println("e.getText() " + e.getText());
            }
        }

        driver.quit();
    }
}
