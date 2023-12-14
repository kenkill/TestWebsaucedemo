package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePageAddtocart;
import tests.cucumber.dataContext.TestContext;

public class HomePageAddCart {
    HomePageAddtocart homePageAddtocart;
    TestContext testContext;
    public HomePageAddCart(TestContext testContext){
        this.testContext = testContext;
        homePageAddtocart = new HomePageAddtocart();
    }
    @Then("homepage is display")
    public void homepageIsDisplay() {
        homePageAddtocart.setHomepageTitle();
    }

    @When("addtocart")
    public void addtocart() {
        homePageAddtocart.setaddToCartButton();
    }

    @And("go to your cart")
    public void goToYourCart() {
        homePageAddtocart.setGoToYourCartIcon();

    }

    @Then("product details will be display correctly")
    public void productDetailsWillBeDisplayCorrectly() {
        Assert.assertEquals(homePageAddtocart.setNameProduct(),"Sauce Labs Backpack");
        Assert.assertEquals(homePageAddtocart.setTextProduct(),"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
        Assert.assertEquals(homePageAddtocart.setpriceProduct(),"29.99");
    }
}
