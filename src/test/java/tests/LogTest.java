package tests;

import org.osgl.util.S;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LogPage;
import pages.MainPage;
import pages.RegisterPage;

public class LogTest extends TestBase{
    RegisterPage register;
    MainPage mainPage;
    LogPage log;

    @Test(priority = 0)
    public void UserCanHoToLoginPage() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.GoToRegisterPage();
        Thread.sleep(1000);
        mainPage.userCanRegister();
    }

    @DataProvider(name = "UserData")
    public Object [][] USerData(){
        return  new Object[][]{
                {"Mahmoud","khedewy","mmmmasws@gmail.com","m0123456"}
        };
    }



    @Test(priority = 1,dependsOnMethods = "UserCanHoToLoginPage",dataProvider = "UserData")
    public void UserCanRegister(String firstName, String lastName, String email, String password) throws InterruptedException {

        register = new RegisterPage(driver);
        register.UserRegisteration(firstName,lastName,email,password);
        Thread.sleep(15000);

    }


    @Test(priority = 2,dependsOnMethods = "UserCanRegister")
    public void userCanLogOUT() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.setDropDownProfile();
        Thread.sleep(3000);
        mainPage.setLogOutBtn();
        Thread.sleep(3000);
        mainPage.GoToRegisterPage();
        Thread.sleep(3000);
    }

    @Test(priority = 3,dependsOnMethods = "userCanLogOUT")
    public void UserCanLogIN() throws InterruptedException {
        log = new LogPage(driver);
        register = new RegisterPage(driver);
        log.userCanLog("mmmmasws@gmail.com","m0123456");
        Thread.sleep(10000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("mahmoud"));
    }




}
