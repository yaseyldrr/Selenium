package Day05;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static { // Başlangıç işlemleri : tearStart();
        // Hep başta çalışcaksa "extend edilen sınıf tarafından"
        // Static ile bu sağlanabilir

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }
    public static void tearDown(){ // Bitirme : Bekle ve Kapat
        MyFunc.bekle(3);
        driver.quit();
    }



}
