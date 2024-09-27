package Day14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;


public class _04_WindowSize extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.youtube.com/");
        MyFunc.bekle(2);

        driver.manage().window().maximize(); // ekranı max yapar

        Dimension ekranBoyutu = driver.manage().window().getSize();
        System.out.println("ekranBoyutu.height = " + ekranBoyutu.height);
        System.out.println("ekranBoyutu.width = " + ekranBoyutu.width);

        MyFunc.bekle(2);
        Dimension yeniBoyut=new Dimension(516,600);
        driver.manage().window().setSize(yeniBoyut); // tarayıcını boyutu
        // istenilen boyutlara geitrdim, teste böyle başlıyorum

        // testler
        BekleKapat();
    }

}
