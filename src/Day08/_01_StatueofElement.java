package Day08;

import Day05.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_StatueofElement extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("Is not it seen ? : " + tuesday.isDisplayed());
        System.out.println("Is it seen ? : " + tuesday.isEnabled());
        System.out.println("Is it checked ? : " + tuesday.isSelected()); // false
        tuesday.click();
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected()); // true

        WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));

        System.out.println("Is not it seen ? : " + saturday.isDisplayed());  // true
        System.out.println("Is it seen ? : " + saturday.isEnabled()); // false
        System.out.println("Is it checked ? : " + saturday.isSelected()); // false

        Assert.assertTrue("Salı günü görünmüyor", tuesday.isDisplayed());
        tearDown();


    }


}
