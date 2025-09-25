package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;
import java.time.Duration;
import java.util.List;

public class DependsOnMethods {


    WebDriver driver;
    @BeforeClass
    public  void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @AfterClass
    public  void teardown(){
        driver.quit();
    }

    @Test
    public void anasayfaTesti(){
        driver.get("https//www.testotomasyonu.com");
        String expectedUrlIcerik ="testotomasyonu";
        String actualUrl =driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

    }
    @Test (dependsOnMethods="anasayfaTesti")
    public void phoneAramaTesti (){
        WebElement aramaKutusu =driver.findElement(By.id("global-search"));
        List<WebElement> bulunananUrunElementleriList= driver.findElements(By.xpath("//*[@*='prod-img']"));



    }

}
