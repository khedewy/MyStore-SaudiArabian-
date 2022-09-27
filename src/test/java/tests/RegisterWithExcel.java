package tests;

import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterWithExcel extends TestBase{
    MainPage mainPage;
    RegisterPage register;
    @Test(priority = 0)
    public void UserCanHoToLoginPage() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.GoToRegisterPage();
        Thread.sleep(1000);
        mainPage.userCanRegister();
    }

    @DataProvider(name = "UserData")
    public Object [][] UserRegisterationData() throws IOException {

        return  new Object[][]{
                {"mahmoud","khedewy", "mmmaaaq12@gmail.com","12345678m"}
        };



       //ExcelReader data = new ExcelReader();
       //return data.getExcelData();
    }



    @Test(priority = 1,dependsOnMethods = "UserCanHoToLoginPage",dataProvider = "UserData")
    public void UserCanRegister(String firstName,String lastName, String email, String password) throws InterruptedException {

        register = new RegisterPage(driver);
        register.UserRegisteration(firstName,lastName,email,password);
        Thread.sleep(15000);

    }
}
