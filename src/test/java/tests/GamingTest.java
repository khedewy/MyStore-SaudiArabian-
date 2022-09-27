package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GamingPage;

public class GamingTest extends TestBase{
    GamingPage gaming;

    @Test(priority = 0)
    public void UserCanDealWithPlayStationItems() throws InterruptedException {
        gaming = new GamingPage(driver);
        gaming.ShowGamingList();
        Thread.sleep(3000);
        gaming.ShowPlaystationItems();
        Thread.sleep(5000);
        Assert.assertTrue(gaming.AssertionMessage.getText().contains("PlayStation"));
    }

    @Test(priority = 1,dependsOnMethods = "UserCanDealWithPlayStationItems")
    public void UserCanDealWithXboxItems() throws InterruptedException {
        gaming = new GamingPage(driver);
        gaming.ShowGamingList();
        Thread.sleep(3000);
        gaming.ShowXboxItems();
        Thread.sleep(5000);
        Assert.assertTrue(gaming.AssertionMessage.getText().contains("Xbox"));
    }

    @Test(priority = 2,dependsOnMethods = "UserCanDealWithXboxItems")
    public void UserCanDealWithSamsungItems() throws InterruptedException {
        gaming = new GamingPage(driver);
        gaming.ShowGamingList();
        Thread.sleep(3000);
        gaming.ShowSamsungItems();
        Thread.sleep(5000);
        Assert.assertTrue(gaming.AssertionMessage.getText().contains("Samsung"));
    }
    @Test(priority = 3,dependsOnMethods = "UserCanDealWithSamsungItems")
    public void UserCanDeaLWithLenovoItems() throws InterruptedException {
        gaming = new GamingPage(driver);
        gaming.ShowGamingList();
        Thread.sleep(3000);
        gaming.ShowLenovoItems();
        Thread.sleep(5000);
        Assert.assertTrue(gaming.AssertionMessage.getText().contains("Lenovo"));
    }
}
