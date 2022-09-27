package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HelpPage;

import java.awt.*;

public class HelpTest extends TestBase{
    HelpPage help;


    @Test
    public void UserCanContactForHelp() throws InterruptedException, AWTException {
        help = new HelpPage(driver);
        Thread.sleep(3000);
        help.OpenChatBox();
        Thread.sleep(2000);
        help.UserCanFillInf("mmm123@gmail.com","mahmoud","1397","i have ordered but I got  nothing so please make " +
                "sure that I got  my order as soon as possible ");
        Thread.sleep(5000);
        help.UploadPhoto();
        Thread.sleep(5000);
        Assert.assertTrue(help.AssertionMessage.getText().contains("Thank You"));


    }

}
