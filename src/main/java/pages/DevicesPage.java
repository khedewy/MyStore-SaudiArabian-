package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevicesPage extends PageBase{
    public DevicesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"navbarmobile_0\"]")
    WebElement DevicesBtn;

    public void ShowDevicesList(){
        clickElements(DevicesBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[1]/div/div/div[2]/ul/li[1]/a")
    WebElement MacBtn;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-catalog/div[1]/div/div[1]/div/div/div[1]/div/nav/ol/li[4]/span")
    public WebElement AssertionAll;

    public void ShowMacDevices(){
        clickElements(MacBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[1]/div/div/div[1]/ul/li[8]/a")
    WebElement NokiaBtn;


    public void ShowNokiaDevice(){
        clickElements(NokiaBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[1]/div/div/div[2]/ul/li[5]/a")
    WebElement MicrosoftBtn;


    public void ShowMicrosoftDevices(){
        clickElements(MicrosoftBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[1]/div/div/div[3]/ul/li[3]/a")
    WebElement HuaweiBtn;

    public void ShowHuaweiDevices(){
        clickElements(HuaweiBtn);
    }
}
