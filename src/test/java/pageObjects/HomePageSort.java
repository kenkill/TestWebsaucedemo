package pageObjects;

import core.driver.Driver;
import core.element.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePageSort {
    private Element homepageTitle = new Element(By.xpath("//div[@class='app_logo']"));
    public void setHomepageTitle(){
        Assert.assertTrue(homepageTitle.isElementDisplayed());
    }
    public void sortOptiondropdown (){
        Select sortOption = new Select(Driver.getWebDriver().findElement(By.xpath("//select[@class='product_sort_container']")));
        sortOption.selectByValue("lohi");
        sortOption.getFirstSelectedOption().getText();
        Assert.assertEquals(sortOption.getFirstSelectedOption().getText(),"Price (low to high)");
    }
    public List<String> sortOptionNamedropdown (){
        List<WebElement> sortOptionNameElements = Driver.getWebDriver().findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> sortOptionName = new ArrayList<>();
        for (WebElement sortOptionNameElement :sortOptionNameElements){
        sortOptionName.add((sortOptionNameElement.getText()));
        }
return sortOptionName;
    }
    public List<Float> sortOptionPricedropdown (){
        List<WebElement> sortOptionPriceElements = Driver.getWebDriver().findElements(By.xpath("//div[@class='inventory_item_price']"));
        List<Float> sortOptionPrice = new ArrayList<>();
        for (WebElement sortOptionPriceElement :sortOptionPriceElements){
             sortOptionPrice.add(Float.valueOf((sortOptionPriceElement.getText().replace("$",""))));
        }
        return sortOptionPrice;
    }
}
