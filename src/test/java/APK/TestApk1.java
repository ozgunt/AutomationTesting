package APK;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestApk1 {

    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "PaxA920Pro");
        caps.setCapability("udid", "1851011135");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Users\\ozgun.tufenkci\\Desktop\\apk\\Manager.apk");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void openApp1() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("APK1 başarıyla açıldı!");
    }

    //@After
    //public void tearDown() {
      //  if (driver != null) {
          //  driver.quit();
        //}
  //  }
}
