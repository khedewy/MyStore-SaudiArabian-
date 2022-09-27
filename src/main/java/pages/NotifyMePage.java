package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotifyMePage extends PageBase{
    public NotifyMePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search-box")
    WebElement searchBox;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-search/div[3]/div/div[2]/product-list/div/div/div/div[2]/product-item/div/a/div[3]/h2")
    WebElement productNameBtn;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[1]/auto-suggest/div/div[2]/div/div[1]/div/div/ul/li[1]/a/span")
    WebElement searchResult;

    public void UserCanSearch(String productName) throws InterruptedException {
        setText(searchBox,productName);
        Thread.sleep(3000);
        clickElements(searchResult);
        Thread.sleep(7000);
        clickElements(productNameBtn);
        Thread.sleep(3000);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-detail/div[2]/div/product-info/div/div/div[2]/div/div[2]/div[2]/notify-me/button")
    WebElement notifyMeBtn;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[2]/form/div[1]/div[1]/input")
    WebElement emailAddressTxt;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[2]/form/div[1]/div[2]/div/input")
    WebElement phoneNumberTxt;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[2]/form/div[2]/button[1]")
    WebElement cnofirmButton;

    public void UserCanBeNotifieByEmailAndMob(String email, String phoneNumber) throws InterruptedException {
        clickElements(notifyMeBtn);
        Thread.sleep(3000);
        setText(emailAddressTxt,email);
        setText(phoneNumberTxt,phoneNumber);
        Thread.sleep(3000);
        clickElements(cnofirmButton);
        Thread.sleep(5000);
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[1]/div[2]/label")
    WebElement phoneChoice;

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[2]/form/div[1]/div[1]/div/input")
    WebElement phoneNumbTxt;

    public void UserNotifyByNumb(String num) throws InterruptedException {
        clickElements(notifyMeBtn);
        Thread.sleep(2000);
        clickElements(phoneChoice);
        Thread.sleep(2000);
        setText(phoneNumbTxt,num);
        clickElements(cnofirmButton);
        Thread.sleep(2000);
    }

    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[1]/div[1]/label")
    WebElement emailChoice;

    @FindBy(xpath ="/html/body/ngb-modal-window/div/div/notify-confirm/div/div[2]/div[2]/form/div[1]/div[1]/input")
    WebElement emailtxt;

    public void UserNotifyByEmail(String email) throws InterruptedException {
        clickElements(notifyMeBtn);
        Thread.sleep(2000);
        clickElements(emailChoice);
        Thread.sleep(2000);
        setText(emailtxt,email);
        Thread.sleep(2000);
        clickElements(cnofirmButton);
    }




}
