package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AcceroiesPaage;

public class AccessoriesTest extends TestBase{
    AcceroiesPaage acceroiesPaage;


    @Test(priority = 0)
    public void UserCanSeeChargeItems() throws InterruptedException {
        acceroiesPaage =  new AcceroiesPaage(driver);
        acceroiesPaage.AccessoriesList();
        Thread.sleep(3000);
        acceroiesPaage.setChargeBtn();
        Thread.sleep(4000);
        Assert.assertTrue(acceroiesPaage.AssertionAll.getText().contains("Charge"));
    }

    @Test(priority = 1,dependsOnMethods = "UserCanSeeChargeItems")
    public void UserCanSeeNetWorkItems() throws InterruptedException {
        acceroiesPaage = new AcceroiesPaage(driver);
        acceroiesPaage.AccessoriesList();
        Thread.sleep(3000);
        acceroiesPaage.setNetWorkBtn();
        Thread.sleep(6000);
        Assert.assertTrue(acceroiesPaage.AssertionAll.getText().contains("Network"));

    }

    @Test(priority = 2,dependsOnMethods = "UserCanSeeNetWorkItems")
    public void UserCanSeeScaleItems() throws InterruptedException {
        acceroiesPaage = new AcceroiesPaage(driver);
        acceroiesPaage.AccessoriesList();
        Thread.sleep(3000);
        acceroiesPaage.setScaleBtn();
        Thread.sleep(6000);
        Assert.assertTrue(acceroiesPaage.AssertionAll.getText().contains("Scale"));

    }

    @Test(priority = 3,dependsOnMethods = "UserCanSeeScaleItems")
    public void UserCanSeeSmartSpeakerItems() throws InterruptedException {
        acceroiesPaage = new AcceroiesPaage(driver);
        acceroiesPaage.AccessoriesList();
        Thread.sleep(3000);
        acceroiesPaage.setSmartSpeakerBtn();
        Thread.sleep(6000);
        Assert.assertTrue(acceroiesPaage.AssertionAll.getText().contains("Smart"));
    }
}
