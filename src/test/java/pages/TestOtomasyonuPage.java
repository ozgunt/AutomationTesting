package pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestOtomasyonuPage {
    public TestOtomasyonuPage(){

        PageFactory.initElements(Driver.getDriver(),this);



    }









    @FindBy(id = "global-search") //xpath ="//input[@class='search-input']"
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@*='prod-img']")
    public List<WebElement> bulunanUrunElementleriList;

    @FindBy(xpath = "//div[@class=' heading-sm mb-4']")
    public  WebElement ilkUrunSayfasindekiIsim;



}
