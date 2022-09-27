package tests;

import org.testng.annotations.Test;
import pages.NotifyMePage;

public class NotifyMeTest extends TestBase{
    NotifyMePage notify;

    @Test(priority = 0)
    public void UserCanBeNotifiedTest() throws InterruptedException {
        notify = new NotifyMePage(driver);
        notify.UserCanSearch("iphone");
        Thread.sleep(3000);
        notify.UserCanBeNotifieByEmailAndMob("aamuyaq235@gmail.com","532545078");
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void UserCanBeNotifidByPhone() throws InterruptedException {
        notify = new NotifyMePage(driver);
        notify.UserNotifyByNumb("512369678");
        Thread.sleep(5000);
    }

    @Test(priority =2)
    public void UserCanBeNotifiedBymail() throws InterruptedException {
        notify = new NotifyMePage(driver);
        notify.UserNotifyByEmail("addggqaq1123@gmail.com");
        Thread.sleep(5000);

    }
}
