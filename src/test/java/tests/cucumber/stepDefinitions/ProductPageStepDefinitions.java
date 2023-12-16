package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.ProductPage;
import tests.cucumber.dataContext.Context;
import tests.cucumber.dataContext.TestContext;

public class ProductPageStepDefinitions {
    ProductPage productPage;
    TestContext testContext;
    public ProductPageStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        productPage = new ProductPage();
    }
    @Then("product details will be display correctly")
    public void productDetailsWillBeDisplayCorrectly() {
    Assert.assertEquals(productPage.setNameProduct(),testContext.getDataContext().getContext(Context.NameProduct));
    Assert.assertEquals(productPage.setTextProduct(),testContext.getDataContext().getContext(Context.TextProduct));
    Assert.assertEquals(productPage.setPriceProduct(),testContext.getDataContext().getContext(Context.PriceProduct));
        }

    @And("click checkoutButton")
    public void clickCheckoutButton() {
        productPage.getCheckoutButton();
    }
}

