package Day14;

/*
   Interview Sorusu

   Windows pencerelerini nasıl kontrol edersin.
   ROBOT Class la kontrol ederim.
 */


import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _01_RobotIntro extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        Robot robot=new Robot();

        driver.switchTo().window(driver.getWindowHandle()); // Mac için
        //robot.keyPress(KeyEvent.VK_META); Mac lerde CTRL

        //Yeni pencere açma işlemi  ctlr+T
        robot.keyPress(KeyEvent.VK_CONTROL);// ctrl bas, şu an artık basılı durumda
        robot.keyPress(KeyEvent.VK_T); // ctrl basılı idi, T harfine bastım
        robot.keyRelease(KeyEvent.VK_T); // T tuşunu bırak
        robot.keyRelease(KeyEvent.VK_CONTROL);  // CTRL tuşunu bırak
        MyFunc.Bekle(2);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // şu an hala 1.sayfadayım

        Set<String> idLer=driver.getWindowHandles();
        Iterator gosterge= idLer.iterator();
        String birinciPencereID= gosterge.next().toString();
        String ikinciPencereID= gosterge.next().toString();

        driver.switchTo().window(ikinciPencereID); //2.Pencereye yani taba geçctim.
        MyFunc.Bekle(2);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.get("https://www.facebook.com/");

        BekleKapat();
    }


}
