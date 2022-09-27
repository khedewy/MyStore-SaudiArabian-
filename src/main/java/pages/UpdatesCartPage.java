package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatesCartPage extends PageBase{
    public UpdatesCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/stc-cart/stc-cart-detail/div/div/div/div[1]/div/stc-cart-list/div/div/div[2]/div[1]/div[3]/button[1]")
    WebElement updateBtn;

    public void UserCanUpdateCart(){
        clickElements(updateBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/stc-cart/stc-cart-detail/div/div/div/div[1]/div/stc-cart-list/div/div/div[2]/div[1]/div[3]/button[2]")
    WebElement deleteBtn;

    public void UserCnDeleteItems(){
        clickElements(deleteBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-detail/div[2]/div/product-info/div/div/div[2]/div/div[2]/div[1]/div/button[2]/span")
    WebElement plusBtn;

    public void userCanAddItem(){
        clickElements(plusBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-detail/div[2]/div/product-info/div/div/div[2]/div/div[2]/div[1]/div/button[1]/span")
    WebElement minusBtn;

    public void UserCanMinusItem(){
        clickElements(minusBtn);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-detail/div[2]/div/product-info/div/div/div[2]/div/div[2]/div[3]/add-to-cart/button")
    WebElement addToCartBtn;

    public void UserCanAddToCartAfterUpdates(){
        clickElements(addToCartBtn);
    }

}
