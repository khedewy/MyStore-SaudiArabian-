package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
    MainPage mainPage;
    RegisterPage register;
    @Test(priority = 0)
    public void UserCanHoToLoginPage() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.GoToRegisterPage();
        Thread.sleep(1000);
        mainPage.userCanRegister();
    }



    @Test(priority = 1,dependsOnMethods = "UserCanHoToLoginPage")
    public void UserCanRegister() throws InterruptedException {

        register = new RegisterPage(driver);
        register.UserRegisteration("mahmoud","khedewy","mmmwzmm123@gmail.com","m1234567");
        Thread.sleep(10000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("mahmoud"));

    }

}
