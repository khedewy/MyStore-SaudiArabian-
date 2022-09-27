package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "i.mystore-profile")
    WebElement registerPageBtn;

    public void GoToRegisterPage(){
        clickElements(registerPageBtn);
    }

    @FindBy(linkText = "Create Account")
    WebElement createEmailBtn;

    public void userCanRegister(){
        clickElements(createEmailBtn);
    }

    @FindBy(id = "profile-dropdown")
    WebElement dropDownProfile;

    public void setDropDownProfile(){
        clickElements(dropDownProfile);

    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/quick-menu/div/div/div/ul/li[7]/a/span[2]")
    WebElement logOutBtn;

    public void setLogOutBtn(){
        clickElements(logOutBtn);
    }

    @FindBy(id = "search-box")
    WebElement searchBox;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[1]/auto-suggest/div/div[2]/div/div[1]/div/div/ul/li[1]/a/span")
    WebElement searchResult;

    public void UserCanSearch(String productName) throws InterruptedException {
        setText(searchBox,productName);
        Thread.sleep(3000);
        clickElements(searchResult);

    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[1]/auto-suggest/div/div[2]/div/div[1]/div/div/ul/li[1]/a/span")
    WebElement productBtn2;

    public void UserCanSearch2(String productName2) throws InterruptedException {
        setText(searchBox,productName2);
        Thread.sleep(2000);
        clickElements(productBtn2);

    }

   
}
