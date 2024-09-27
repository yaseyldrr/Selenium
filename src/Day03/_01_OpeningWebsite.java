package Day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver(); // tarayıcı driver oluşturuldu
                         // new FireFoxDriver()
                         // new EdgeDriver()

        driver.get("https://techno.study/tr");  // web sayfasını aç

        // 3 sn bekle
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit(); // hafızadan temizle,boşalt
    }
}
