package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-search/div[3]/div/div[2]/product-list/div/div/div/div[4]/product-item/div/a/div[3]/p")
    WebElement productBtn;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-search/div[2]/div/div/div/div[2]/p/q/strong")
    public WebElement AssertionMessage;

    @FindBy(css = "div.cart-product-name")
    public WebElement AssertAddToCartMessage;

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/stc-header/div/nav/div/div[3]/stc-cart/stc-cart-popup/div/div[1]/button[2]")
    WebElement ViewCartDetails;

    public void ViewCart(){
        clickElements(ViewCartDetails);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-search/div[3]/div/div[2]/product-list/div/div/div/div[2]/product-item/div/a/div[3]/h2")
    WebElement product2;

    public void UserCanAddToCarT2(){
        clickElements(product2);
    }

    @FindBy(xpath = "/html/body/stc-root/stc-root/stc-home/div/product-detail/div[2]/div/product-info/div/div/div[2]/div/div[2]/div[3]/add-to-cart/button")
    WebElement addToCart2;

    public void UserAdding(){
        clickElements(addToCart2);
    }



}
