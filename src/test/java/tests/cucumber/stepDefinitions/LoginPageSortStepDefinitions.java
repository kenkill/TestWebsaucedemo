package tests.cucumber.stepDefinitions;

import core.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginPageSort;
import tests.cucumber.dataContext.TestContext;



public class LoginPageSortStepDefinitions  {
    LoginPageSort loginPageSort;
    TestContext testContext;
    ConfigReader configReader;
    public LoginPageSortStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        configReader = new ConfigReader();
        loginPageSort = new LoginPageSort();
    }
    @Given("is on Login page")
    public void isOnLoginPage() {
    }

    @When("user login with username and password")
    public void userLoginWithUsernameAndPassword() {
        String userIp = configReader.readConfigData("userIp");
        String passIp = configReader.readConfigData("passIp");
        loginPageSort.signin(userIp, passIp);
    }
}
