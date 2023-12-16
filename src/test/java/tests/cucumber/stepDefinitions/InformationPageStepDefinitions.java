package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.InformationPage;
import tests.cucumber.dataContext.TestContext;

public class InformationPageStepDefinitions {
    InformationPage informationPage;
    TestContext testContext;
    public InformationPageStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        informationPage = new InformationPage();
    }
    @Then("input valid information")
    public void inputValidInformation() {
    informationPage.getFirstNameInput();
    informationPage.getLastNameInput();
    informationPage.getPostalCodeInput();
    }

    @And("click continue")
    public void clickContinue() {
        informationPage.getContinueButton();
    }
}
