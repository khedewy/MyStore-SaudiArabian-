package tests;

import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreAndGamingCardPage;

public class StoreAndGaminGCaardTest extends TestBase{
    StoreAndGamingCardPage store;

    @Test(priority = 0)
    public void UserCanSeeGoogleItems() throws InterruptedException {
        store = new StoreAndGamingCardPage(driver);
        Thread.sleep(3000);
        store.userCanSeeSGItems();
        Thread.sleep(3000);
        store.UserCanSeeGooglePlayItems();
        Thread.sleep(5000);
        Assert.assertTrue(store.AssertionMessage.getText().contains("Google"));
    }

    @Test(priority = 1,dependsOnMethods = "UserCanSeeGoogleItems")
    public void UserCanDealWithAmazonItems() throws InterruptedException {
        store = new StoreAndGamingCardPage(driver);
        store.userCanSeeSGItems();
        Thread.sleep(3000);
        store.UserCanAmazonItems();
        Thread.sleep(5000);
        Assert.assertTrue(store.AssertionMessage.getText().contains("Amazon"));
    }

    @Test(priority = 2,dependsOnMethods = "UserCanDealWithAmazonItems")
    public void UserCanDealWithLegendGameItems() throws InterruptedException {
        store = new StoreAndGamingCardPage(driver);
        store.userCanSeeSGItems();
        Thread.sleep(3000);
        store.UserCanSeeLehendsItems();
        Thread.sleep(5000);
        Assert.assertTrue(store.AssertionMessage.getText().contains("Legend"));
    }

    @Test(priority = 3,dependsOnMethods = "UserCanDealWithLegendGameItems")
    public void UserCanDealWithFifaGame() throws InterruptedException {
        store = new StoreAndGamingCardPage(driver);
        store.userCanSeeSGItems();
        Thread.sleep(3000);
        store.UserCanSeeFifaItems();
        Thread.sleep(5000);
        Assert.assertTrue(store.AssertionMessage.getText().contains("FIFA"));
    }

    @Test(priority = 4,dependsOnMethods = "UserCanDealWithFifaGame")
    public void UserCanDealWithShahidItems() throws InterruptedException {
        store = new StoreAndGamingCardPage(driver);
        store.userCanSeeSGItems();
        Thread.sleep(3000);
        store.UserCanSeeShahidLink();
        Thread.sleep(5000);
        Assert.assertTrue(store.AssertionMessage.getText().contains("Shahid"));
    }
}
