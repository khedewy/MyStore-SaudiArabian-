package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DevicesPage;

public class DevicesTest extends TestBase{
    DevicesPage device;

    @Test
    public void UserCanSeeMacDevices() throws InterruptedException {
        device = new DevicesPage(driver);
        device.ShowDevicesList();
        Thread.sleep(3000);
        device.ShowMacDevices();
        Thread.sleep(5000);
        Assert.assertTrue(device.AssertionAll.getText().contains("MacBook"));
        Thread.sleep(3000);
    }

    @Test(priority = 1,dependsOnMethods = "UserCanSeeMacDevices")
    public void UserCanSeeNokiaDevices() throws InterruptedException {
        device = new DevicesPage(driver);
        device.ShowDevicesList();
        Thread.sleep(3000);
        device.ShowNokiaDevice();
        Thread.sleep(5000);
        Assert.assertTrue(device.AssertionAll.getText().contains("Nokia"));
        Thread.sleep(3000);
    }

    @Test(priority = 2,dependsOnMethods = "UserCanSeeNokiaDevices")
    public void UserCanSeeMicrosoftDevices() throws InterruptedException {
        device = new DevicesPage(driver);
        device.ShowDevicesList();
        Thread.sleep(3000);
        device.ShowMicrosoftDevices();
        Thread.sleep(5000);
        Assert.assertTrue(device.AssertionAll.getText().contains("Microsoft"));
        Thread.sleep(3000);

    }

    @Test(priority = 3,dependsOnMethods = "UserCanSeeMicrosoftDevices")
    public void UserCanSeeHuaweiDevices() throws InterruptedException {
        device = new DevicesPage(driver);
        device.ShowDevicesList();
        Thread.sleep(2000);
        device.ShowHuaweiDevices();
        Thread.sleep(5000);
        Assert.assertTrue(device.AssertionAll.getText().contains("Huawei"));
    }


}
