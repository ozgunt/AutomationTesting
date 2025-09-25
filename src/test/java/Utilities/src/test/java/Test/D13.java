package Test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Utilities.Driver;
import Utilities.ReusableMethods;

public class D13 {


    @Test
    public void driverClassIlkTest (){


        Driver.getDriver().get("https://www.testotomasyonu.com/");
        ReusableMethods.bekle(1);
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("global-search"));
        ReusableMethods.bekle(1);
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        ReusableMethods.bekle(1);

        String expectedResult="testotomasyon";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedResult));
        ReusableMethods.bekle(1);

        if (actualURL.contains(expectedResult)){
            System.out.println("Test Pass");


        }


        Driver.quitDriver();

    }

    @Test


    public void driverClassIkinciTest (){


        Driver.getDriver().get("https://www.youtube.com/");
        ReusableMethods.bekle(1);
        String expectedResult="you";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedResult));
        ReusableMethods.bekle(1);

        if (actualURL.contains(expectedResult)){
            System.out.println("Test Pass");




        }else System.out.printf("Test Failed");

        Driver.quitDriver();




    }
}
