package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;
import pages.SearchPage;
import pages.UpdatesCartPage;

public class UpdateCartTest extends TestBase{
    UpdatesCartPage update;
    MainPage mainPage;
    SearchPage search;
    RegisterPage register;

    @Test(priority = 0)
    public void UserRegisteration() throws InterruptedException {
        mainPage = new MainPage(driver);
        register = new RegisterPage(driver);
        mainPage = new MainPage(driver);
        mainPage.GoToRegisterPage();
        Thread.sleep(1000);
        mainPage.userCanRegister();
        register = new RegisterPage(driver);
        register.UserRegisteration("mahmoud","khedewy","q000wmm123@gmail.com","m1234567");
        Thread.sleep(15000);

    }

    @Test(priority = 1,dependsOnMethods = "UserRegisteration")
    public void UserCanAddToCart() throws InterruptedException {
        mainPage = new MainPage(driver);
        search = new SearchPage(driver);
        mainPage.UserCanSearch("samsung");
        Thread.sleep(5000);
        search.UserCanAddToCarT2();
        Thread.sleep(5000);
        search.UserAdding();
        Thread.sleep(10000);
        search.ViewCart();
        Thread.sleep(5000);
    }
    @Test(priority = 2, dependsOnMethods = "UserCanAddToCart")
    public void UserCanUpdateCart() throws InterruptedException {
        update = new UpdatesCartPage(driver);
        search = new SearchPage(driver);
        update.UserCanUpdateCart();
        Thread.sleep(10000);
        update.userCanAddItem();
        Thread.sleep(5000);
        update.userCanAddItem();
        Thread.sleep(5000);
        update.UserCanMinusItem();
        Thread.sleep(5000);
        update.UserCanAddToCartAfterUpdates();
        Thread.sleep(10000);
        search.ViewCart();
        Thread.sleep(5000);


    }
}
