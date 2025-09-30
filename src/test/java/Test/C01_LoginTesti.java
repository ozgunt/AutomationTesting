package Test;
import Utilities.ConfigReader;
import Utilities.ReusableMethods;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import Utilities.Driver;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;

public class C01_LoginTesti {
@Test
    public void LoginTesti () {
        System.out.println("Gidilecek URL: " + ConfigReader.getProperty("toUrl"));

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.click();
        ReusableMethods.bekle(5);
        testOtomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("kutusu"), Keys.ENTER);
        ReusableMethods.bekle(5);


}


}
