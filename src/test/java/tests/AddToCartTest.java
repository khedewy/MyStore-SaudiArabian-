package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchPage;

public class AddToCartTest extends TestBase{

    MainPage main;
    SearchPage search;
    @Test(priority =0)
    public void UserCanAddToCart() throws InterruptedException {
        main = new MainPage(driver);
        search = new SearchPage(driver);
        Thread.sleep(3000);
        main.UserCanSearch("samsung");
        Thread.sleep(5000);
        search.UserCanAddToCarT2();
        Thread.sleep(5000);
        search.UserAdding();
        Thread.sleep(10000);
        search.ViewCart();
        Thread.sleep(5000);
        Assert.assertTrue(search.AssertAddToCartMessage.getText().contains("Galaxy"));

    }

}
