package Day07;
import Day05.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_XPath extends BaseDriver {
    @Test
    public void Test() {
    // 1- https://www.saucedemo.com/
    // 2- login işlemini yapınız.
    // 3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
    // 4- Sonra geri dönün (Back to products e tıklatın)
    // 5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
    // 6- sepete tıklatın
    // 7- CheckOut a tıklatın
    // 8- kullanıcı bilgilerini doldurup Continue ya tıklatın
    // 9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
    // Item total e eşit olup olmadığını Assert ile test ediniz.
    // Bu soruda tamamen XPATH kullanılacaktır.
    // Assert.assertTrue(urunFiyatToplamlam == itemTotal)

        driver.get("https://www.saucedemo.com/");
        MyFunc.bekle(2);

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.bekle(2);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunc.bekle(2);

        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();
        MyFunc.bekle(2);

        WebElement btnBack = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        btnBack.click();
        MyFunc.bekle(2);

        WebElement back1 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back1.click();
        MyFunc.bekle(2);

        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();
        MyFunc.bekle(2);

        WebElement button2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        button2.click();
        MyFunc.bekle(2);

        WebElement back2 = driver.findElement(By.xpath("//button[@name='back-to-products']"));
        back2.click();
        MyFunc.bekle(2);
        WebElement sepet = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        sepet.click();
        MyFunc.bekle(2);

        WebElement check = driver.findElement(By.xpath("//button[@id='checkout']"));
        check.click();
        MyFunc.bekle(2);

        WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        fname.sendKeys("Yase");
        MyFunc.bekle(2);
        WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lname.sendKeys("Yıldırır");
        MyFunc.bekle(2);

        WebElement Posta = driver.findElement(By.xpath("//input[@name='postalCode']"));
        Posta.sendKeys("42070");
        MyFunc.bekle(2);

        WebElement continue2 = driver.findElement(By.xpath("//input[@type='submit']"));
        continue2.click();
        MyFunc.bekle(2);

        WebElement total = driver.findElement(By.xpath("//div[@data-test='subtotal-label']"));

        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        double totalfiyat = 0.0;


        for (WebElement a : priceElements) {
            String fiyat1 = a.getText().replaceAll("[^0-9,.]","");

            totalfiyat +=  Double.parseDouble(fiyat1);
        }

        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary-subtotal-label']"));
        double alttoplam  = Double.parseDouble(subTotal.getText().replace("$",""));
        MyFunc.bekle(2);

        Assert.assertTrue("Error!",totalfiyat==alttoplam);

        tearDown();






    }
}
