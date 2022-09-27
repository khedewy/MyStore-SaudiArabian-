package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BusinessProductPage;

public class BusinessProductTest extends TestBase{

    BusinessProductPage business;

    @Test(priority = 0)
    public void UserCanDealWithSUMNIItems() throws InterruptedException {
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowSumniItems();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("SUNMI"));
    }

    @Test(priority = 1,dependsOnMethods = "UserCanDealWithSUMNIItems")
    public void UserCanDealWithFoodicsItems() throws InterruptedException{
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowFoodicsLink();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("Foodics"));

    }

    @Test(priority = 2,dependsOnMethods = "UserCanDealWithFoodicsItems")
    public void UserCanDealWithHoneyWell() throws InterruptedException {
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowHoneyWellItems();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("Honeywell"));
    }

    @Test(priority = 3,dependsOnMethods = "UserCanDealWithHoneyWell" )
    public void UserCanDealWithArubaAItems() throws InterruptedException {
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowArubaItems();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("Aruba"));
    }

    @Test(priority = 4,dependsOnMethods = "UserCanDealWithArubaAItems")
    public void UserCanDealWithHBEItems() throws InterruptedException {
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowHBEItems();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("HPE"));
    }

    @Test(priority = 5,dependsOnMethods = "UserCanDealWithHBEItems")
    public void UserCanDealWithEZVIVItems() throws InterruptedException {
        business = new BusinessProductPage(driver);
        business.ShowBusinessProductItems();
        Thread.sleep(3000);
        business.ShowEZVIVLink();
        Thread.sleep(5000);
        Assert.assertTrue(business.AssertionMessage.getText().contains("EZVIV"));
    }
}
