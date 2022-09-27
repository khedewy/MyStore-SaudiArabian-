package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;

public class SearchTest extends TestBase{

    MainPage main;
    SearchPage search;

    @Test
    public void UserCnSearch() throws InterruptedException {
        main = new MainPage(driver);
        search = new SearchPage(driver);
        Thread.sleep(3000);
        main.UserCanSearch("iphone");
        Thread.sleep(5000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("iPhone"));
    }

}
