package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-registration/stc-registration-popup/div/form/div[1]/input")
    WebElement firstNameTxt;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-registration/stc-registration-popup/div/form/div[2]/input")
    WebElement lastNameTxt;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-registration/stc-registration-popup/div/form/div[3]/input")
    WebElement emailTxt;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-registration/stc-registration-popup/div/form/div[4]/div/input")
    WebElement passwordTxt;

    @FindBy(css = "span.checkmark")
    WebElement checkMark;

    @FindBy(css = "input.btn.btn-primary.login-btn")
    WebElement signBtn;

    @FindBy(id = "profile-dropdown")
    public WebElement AssertionMessage;

    public void UserRegisteration(String firstName,String lastName, String email,String password) throws InterruptedException {
        setText( firstNameTxt,firstName);
        setText(lastNameTxt,lastName);
        setText(emailTxt,email);
        setText(passwordTxt,password);
        Thread.sleep(2000);
        clickElements(checkMark);
        Thread.sleep(2000);
        clickElements(signBtn);
        Thread.sleep(5000);
    }

    public void setText(){

    }




}
