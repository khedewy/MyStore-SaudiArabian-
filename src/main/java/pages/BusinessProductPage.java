package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessProductPage extends PageBase{
    public BusinessProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "navbarmobile_10")
    WebElement BusinessProductList;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-catalog/div[1]/div/div[1]/div/div/div[1]/div/nav/ol/li[4]/span")
    public WebElement AssertionMessage;

    public void ShowBusinessProductItems(){
        clickElements(BusinessProductList);
    }
    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
    WebElement Sunmilink;

    public void ShowSumniItems(){
        clickElements(Sunmilink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[1]/ul/li[2]/a")
    WebElement foodicsLink;

    public void ShowFoodicsLink(){
        clickElements(foodicsLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[2]/ul/li/a")
    WebElement HonewyWell;

    public void ShowHoneyWellItems(){
        clickElements(HonewyWell);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[3]/ul/li[2]/a")
    WebElement ArubaLink;

    public void ShowArubaItems(){
        clickElements(ArubaLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[3]/ul/li[3]/a")
    WebElement HBELink;

    public void ShowHBEItems(){
        clickElements(HBELink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[6]/div/div/div[4]/ul/li[2]/a")
    WebElement EzvivLink;

    public void ShowEZVIVLink(){
        clickElements(EzvivLink);
    }
}
