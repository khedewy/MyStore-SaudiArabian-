package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
    public static WebDriver driver;

    @BeforeTest
    @Parameters({"browser"})
    public void setDriver(@Optional("firefox") String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.mystore.com.sa/en");
        }
        else if (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.mystore.com.sa/en");
        }
    }


    @AfterTest
    public void closeDriver(){
        driver.close();
    }

}
