package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageAddtocart;
import tests.cucumber.dataContext.TestContext;

import static tests.cucumber.dataContext.Context.*;

public class HomePageAddCartStepDefinitions {
    HomePageAddtocart homePageAddtocart;
    TestContext testContext;
    public HomePageAddCartStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        homePageAddtocart = new HomePageAddtocart();
    }
    @Then("homepage is display")
    public void homepageIsDisplay() {
        homePageAddtocart.setHomepageTitle();
        String textProductHomepage = homePageAddtocart.setTextProductHomepage();
        testContext.getDataContext().setContext(TextProduct,textProductHomepage);
        String priceProductHomepage = homePageAddtocart.setPriceProductHomepage();
        testContext.getDataContext().setContext(PriceProduct,priceProductHomepage);
        String nameProductHomepage = homePageAddtocart.setNameProductHomepage();
        testContext.getDataContext().setContext(NameProduct,nameProductHomepage);
    }

    @When("addtocart")
    public void addtocart() {
        homePageAddtocart.setaddToCartButton();
    }

    @And("go to your cart")
    public void goToYourCart() {
        homePageAddtocart.setGoToYourCartIcon();

    }


}
