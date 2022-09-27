package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcceroiesPaage extends PageBase{
    public AcceroiesPaage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "navbarmobile_3")
    WebElement AccessoriesBtn;

    public void AccessoriesList(){
        clickElements(AccessoriesBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[2]/div/div/div[1]/ul/li[2]/a")
    WebElement chargeBtn;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-catalog/div[1]/div/div[1]/div/div/div[1]/div/nav/ol/li[4]/span")
    public WebElement AssertionAll;

    public void setChargeBtn(){
        clickElements(chargeBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[2]/div/div/div[1]/ul/li[7]/a")
    WebElement netWorkBtn;

    public void setNetWorkBtn(){
        clickElements(netWorkBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[2]/div/div/div[2]/ul/li[3]/a")
    WebElement scaleBtn;

    public void setScaleBtn(){
        clickElements(scaleBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[2]/div/div/div[2]/ul/li[5]/a")
    WebElement smartSpeakerBtn;

    public void setSmartSpeakerBtn(){
        clickElements(smartSpeakerBtn);
    }
}
