package Day14;

import Utility.BaseDriver;
import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _03_ScreenCast extends BaseDriver {


    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // kendinize kod yazıyorsanız.
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("1234");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Invalid credentials']")));

        List<WebElement> errorMsg = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size() > 0) {
            System.out.println("Hata");
            // hata oluştu ekran kaydı al

            TakesScreenshot ts = (TakesScreenshot) driver;
            File hafizadakiFile = ts.getScreenshotAs(OutputType.FILE);  // ekran kaydını Dosya formatı olarak hafızaya alınmış oldu
            FileUtils.copyFile(hafizadakiFile, new File("C:\\Users\\Yasemin Monster\\OneDrive\\Resimler\\screenShot.jpg")); //2024_04_05_13_56

            //Şu anda hafızadaki görüntüyü dosya olarak kaydetti.
        }


        BekleKapat();
    }

}
