package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.OverviewPage;
import tests.cucumber.dataContext.TestContext;

public class OverviewPageStepDefinitions {
    OverviewPage overviewPage;
    TestContext testContext;
    public OverviewPageStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        overviewPage = new OverviewPage();
    }
    @And("click finish")
    public void clickFinish() {
        overviewPage.getFinishButton();
    }
}
