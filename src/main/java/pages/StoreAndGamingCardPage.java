package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StoreAndGamingCardPage extends PageBase{
    public StoreAndGamingCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "navbarmobile_6")
    WebElement S_AndGamingCardsBtn;

    @FindBy(css = "span.ng-star-inserted")
    public WebElement AssertionMessage;

    public void userCanSeeSGItems(){
        clickElements(S_AndGamingCardsBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[4]/div/div/div[1]/ul/li[2]/a")
    WebElement googlePlayLink;

    public void UserCanSeeGooglePlayItems(){
        clickElements(googlePlayLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[4]/div/div/div[1]/ul/li[3]/a")
    WebElement AmazonLinks;

    public void UserCanAmazonItems(){
        clickElements(AmazonLinks);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[4]/div/div/div[2]/ul/li[6]/a")
    WebElement LegendsLink;

    public void UserCanSeeLehendsItems(){
        clickElements(LegendsLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[4]/div/div/div[2]/ul/li[8]/a")
    WebElement FifaLink;

    public void UserCanSeeFifaItems(){
        clickElements(FifaLink);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/stc-menu/div[1]/div/div/nav/div/ul/li[4]/div/div/div[3]/ul/li[1]/a")
    WebElement ShahidLink;

    public void UserCanSeeShahidLink(){
        clickElements(ShahidLink);
    }
}
