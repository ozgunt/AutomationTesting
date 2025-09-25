package Test;

import Utilities.Driver;
import Utilities.TestBase_All;
import net.bytebuddy.build.Plugin;
import org.apache.commons.lang3.ObjectUtils;
import org.jspecify.annotations.NullUnmarked;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.TestOtomasyonuPage;



import java.util.PriorityQueue;
import java.util.Properties;

public class D14 {

    @Test(priority = 1)
    public void A1_anasayfaTesti (){
        Driver.getDriver().get("https://www.testotomasyonu.com/");
        String expectedUrlIcerik= "testotomasyonu";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
    }
    @Test(priority = 2)
    public void A2_phoneAramaTesti(){
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        int actualBulunanUrunSayisi =testOtomasyonuPage.bulunanUrunElementleriList.size();
        Assert.assertTrue(actualBulunanUrunSayisi>0);
        testOtomasyonuPage.bulunanUrunElementleriList.get(0).click();

    }
    @Test(priority = 3)
    public void A3_ilkUrunIsimTesti (){
        TestOtomasyonuPage testOtomasyonuPage= new TestOtomasyonuPage();
        String expectedUrunIsmi="phone";
        String actualUrunIsmi= testOtomasyonuPage.ilkUrunSayfasindekiIsim.getText().toLowerCase();
        Assert.assertTrue(actualUrunIsmi.contains(expectedUrunIsmi));


    }@Test
    public void  deneme(){





    }





}
