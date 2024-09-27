package Day09;

import Day05.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_DragAndDropByTest extends BaseDriver {
    @Test
    public void Test1() {
        // TODO : sol sürgüyü $200 noktasına, sağ sürgüyü $400 noktasına kaydırınız.
        // Not: Bir WebElementin genişliğini nasıl alırsın?
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        WebElement solSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        WebElement sagSurgu = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));

        // Sürgünün boyu 500$ kadar, sürgünün boyu pixel cinsinden 1000px ise 100$ için 200px kaydırılmalıdır.
        // + girildiğinde sağa doğru, - ise sola doğru kaydırır. (x: yatay, y: dikey)
        Actions actions = new Actions(driver);

        WebElement cubuk = driver.findElement(By.xpath("//*[@id='slider-range']/div"));
        int genislik = cubuk.getSize().width;
        System.out.println(genislik);

        Action action = actions.dragAndDropBy(solSurgu,(500/genislik)*200,0).build();
        Action action1 = actions.dragAndDropBy(sagSurgu,(500 / genislik)*400,0).build();
        action.perform();
        action1.perform();

        tearDown();
    }
}
