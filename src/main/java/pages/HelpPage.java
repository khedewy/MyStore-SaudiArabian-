package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class HelpPage extends PageBase{
    public HelpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-chat-help/div/div/button")
    WebElement chatBoxBtn;

    public void OpenChatBox(){
        clickElements(chatBoxBtn);
    }

    @FindBy(id = "customerName")
    WebElement customerNameTxt;

    @FindBy(id = "email")
    WebElement emailTxt;

    @FindBy(id = "orderNumber")
    WebElement orderNumTxt;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-chat-help/div/div/div[2]/div/stc-customer-care/div/div[1]/form/div/div[4]/textarea")
    WebElement descriptionTxt;

    @FindBy(css = "button.btn.btn-primary.mx-3")
    WebElement submitBtn;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/stc-toaster")
    public WebElement AssertionMessage;

    public void UserCanFillInf(String email, String name,String orderName, String description) throws InterruptedException {
        setText(customerNameTxt,name);
        setText(emailTxt,email);
        setText(orderNumTxt,orderName);
        setText(descriptionTxt,description);
        Thread.sleep(3000);
        Thread.sleep(7000);
        //clickElements(submitBtn);

    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-chat-help/div/div/div[2]/div/stc-customer-care/div/div[1]/form/div/div[5]/button")
    WebElement uploadFilesBtn;

    public void UploadPhoto() throws AWTException {
        String imgPath = System.getProperty("user.dir")+"C://Users/CompuMisr/untitled2/Uploads/certificates_TAU-638756fe.png";

        StringSelection stringSelection = new StringSelection(imgPath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        clickElements(uploadFilesBtn);
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(4000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        clickElements(submitBtn);
    }



}
