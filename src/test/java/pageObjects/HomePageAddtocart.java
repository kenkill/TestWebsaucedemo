package pageObjects;

import core.element.Element;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePageAddtocart {
    private Element homepageTitle = new Element(By.xpath("//div[@class='app_logo']"));
    public void setHomepageTitle(){
        Assert.assertTrue(homepageTitle.isElementDisplayed());
    }

    private Element addToCartButton = new Element(By.xpath("//*[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']//button[@class='btn_primary btn_inventory']"));
    public void setaddToCartButton(){addToCartButton.click();}

    private Element goToYourCartIcon = new Element(By.xpath("//div[@id='shopping_cart_container']//a"));
    public void setGoToYourCartIcon(){goToYourCartIcon.click();}


    public String setNameProductHomepage(){
         Element nameProductHomepage = new Element(By.xpath("//div[text()='Sauce Labs Backpack']"));
        nameProductHomepage.getText();
        return nameProductHomepage.getText();
    }

    public String setTextProductHomepage(){
        Element textProductHomepage = new Element(By.xpath("//div[text()='Sauce Labs Backpack']//parent::a//following-sibling::div[@class='inventory_item_desc']"));
        textProductHomepage.getText();
        return textProductHomepage.getText();
    }

    public String setPriceProductHomepage(){
        Element priceProductHomepage = new Element(By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']//div[@class='inventory_item_price']"));
        priceProductHomepage.getText().replace("$","");
        return priceProductHomepage.getText().replace("$","");
    }




}
