package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GamingPage extends PageBase{
    public GamingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "navbarmobile_9")
    WebElement GamingList;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-catalog/div[1]/div/div[1]/div/div/div[1]/div/nav/ol/li[4]/span")
    public WebElement AssertionMessage;

    public void ShowGamingList(){
        clickElements(GamingList);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[5]/div/div/div[1]/ul/li[1]/a")
    WebElement playStationLink;

    public void ShowPlaystationItems(){
        clickElements(playStationLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[5]/div/div/div[1]/ul/li[2]/a")
    WebElement XboxLink;

    public void ShowXboxItems(){
        clickElements(XboxLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[5]/div/div/div[2]/ul/li[1]/a")
    WebElement SamsungLink;

    public void ShowSamsungItems(){
        clickElements(SamsungLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[5]/div/div/div[2]/ul/li[2]/a")
    WebElement LenovoLink;

    public void ShowLenovoItems(){
        clickElements(LenovoLink);
    }
}
