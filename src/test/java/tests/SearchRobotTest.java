package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchWithRobotPage;

import java.awt.*;

public class SearchRobotTest extends TestBase{
    SearchWithRobotPage search;
    SearchPage searchAssertion;

    @Test
    public void UserSearch() throws AWTException, InterruptedException {
        search = new SearchWithRobotPage(driver);
        searchAssertion = new SearchPage(driver);
        search.UserCanSearch("iphone");
        Thread.sleep(5000);
        Assert.assertTrue(searchAssertion.AssertAddToCartMessage.getText().contains("iPhone"));



    }
}
