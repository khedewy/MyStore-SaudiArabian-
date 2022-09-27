package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchWithRobotPage extends PageBase{
    public SearchWithRobotPage(WebDriver driver) throws AWTException {
        super(driver);
        robot = new Robot();
    }
    @FindBy(id = "search-box")
    WebElement searchBox;

    public void UserCanSearch(String productName) throws InterruptedException {
        setText(searchBox,productName);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


}
