package Utilities;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    public static WebDriver driver;



    public  static WebDriver getDriver () {
        String KullanilacakBrowser = ConfigReader.getProperty("browser");

        if (driver == null){
            switch (KullanilacakBrowser){

                case "Firefox":driver = new FirefoxDriver();break;
                case "IE":driver = new InternetExplorerDriver();break;
                case  "Safari":driver = new SafariDriver();break;
                case  "Edge":driver = new EdgeDriver();break;
                default:driver = new ChromeDriver();break;


            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }

        return driver;


    }

    public  static  void quitDriver(){

        driver.quit();
        driver=null;
    }
}
