package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPage extends PageBase{
    public LogPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-login/stc-login-popup/div/form/div[1]/input")
    WebElement emailTxt;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[2]/ul/li[5]/div/login-signup/stc-login/stc-login-popup/div/form/div[2]/div/input")
    WebElement passwordTxt;

    @FindBy(css = "input.btn.btn-primary.login-btn")
    WebElement logBtn;

    public void userCanLog(String email, String password) throws InterruptedException {
        setText(emailTxt,email);
        setText(passwordTxt,password);
        Thread.sleep(3000);
        clickElements(logBtn);
    }
}
