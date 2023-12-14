package tests.cucumber.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.HomePageSort;
import tests.cucumber.dataContext.TestContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePageSortStepDefinitions {
    HomePageSort homePageSort;
    TestContext testContext;

    public HomePageSortStepDefinitions(TestContext testContext){
        this.testContext = testContext;
        homePageSort = new HomePageSort();
    }
    @Then("homepage title is display")
    public void homepageTitleIsDisplay() {
        homePageSort.setHomepageTitle();
    }

    @When("user choose option {string}")
    public void userChooseOption(String sortoption) {
        homePageSort.sortOptiondropdown();
    }

    @Then("product list will be display correctly")
    public void productListWillBeDisplayCorrectly() {
//        List<String> sortOptionName = homePageSort.sortOptionNamedropdown();
//        List<String> sortedOptions = new ArrayList<>(sortOptionName);
//        System.out.println(sortedOptions);
        //sort z-a
       // Collections.reverse(sortedOptions);
//        //sort a-z
//        Collections.sort(sortedOptions);
//        System.out.println(sortedOptions);
//        Assert.assertEquals(sortOptionName,sortedOptions);
        List<Float> sortOptionPrice = homePageSort.sortOptionPricedropdown();
        List<Float> sortedOptions = new ArrayList<>(sortOptionPrice);
        System.out.println(sortedOptions);
        //sort z-a
     // Collections.reverse(sortedOptions);
        //sort a-z
      Collections.sort(sortedOptions);
        System.out.println(sortedOptions);
        Assert.assertEquals(sortOptionPrice,sortedOptions);
    }
}
