package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class PageBase {
    protected WebDriver driver;
    public Robot robot;




    public PageBase(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public static void setText(WebElement text, String value){
        text.sendKeys(value);
    }

    public static void clickElements(WebElement button){
        button.click();

    }

    public static void  clearElements(WebElement clear){
        clear.clear();
    }


}
