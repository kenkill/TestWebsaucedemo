package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageObjects.CompletePage;
import tests.cucumber.dataContext.TestContext;

public class CompletePageStepDefinitions {
    CompletePage completePage;
    TestContext testContext;
    public CompletePageStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        completePage = new CompletePage();
    }
    @Then("verify valid text complete")
    public void verifyValidTextComplete() {
        Assert.assertEquals(completePage.TextComplete(),"THANK YOU FOR YOUR ORDER");
    }
}
