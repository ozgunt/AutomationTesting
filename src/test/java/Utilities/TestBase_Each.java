package Utilities;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase_Each {

    protected  WebDriver driver;

    @BeforeEach
    public void  setup (){
        this.driver =new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));




    }

    @AfterEach
    public void Teardown (){this.driver.quit();





    }





}
