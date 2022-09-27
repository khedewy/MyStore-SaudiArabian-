package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LogPage;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterWithDataProvider extends TestBase{
    RegisterPage register;
    MainPage mainPage;
    LogPage log;

    @DataProvider(name = "UserData")
    public Object [][] USerData(){
        return  new Object[][]{
                {"Mahmoud","khedewy","bqwaaasazas@gmail.com","m0123456"},
                {"ahmed","mohamed","aaqaznnsa@gmail.com","m0123456"}
        };
    }



    @Test(priority = 0,dataProvider = "UserData")
    public void UserCanRegister(String firstName, String lastName, String email, String password) throws InterruptedException {

        mainPage = new MainPage(driver);
        mainPage.GoToRegisterPage();
        Thread.sleep(1000);
        mainPage.userCanRegister();
        register = new RegisterPage(driver);
        register.UserRegisteration(firstName,lastName,email,password);
        Thread.sleep(15000);
        mainPage = new MainPage(driver);
        mainPage.setDropDownProfile();
        Thread.sleep(3000);
        mainPage.setLogOutBtn();
        Thread.sleep(3000);
        mainPage.GoToRegisterPage();
        Thread.sleep(3000);
        log = new LogPage(driver);
        log.userCanLog(email,password);
        Thread.sleep(10000);
        mainPage.setDropDownProfile();
        Thread.sleep(3000);
        mainPage.setLogOutBtn();
        Thread.sleep(3000);
        mainPage.GoToRegisterPage();
    }
}
