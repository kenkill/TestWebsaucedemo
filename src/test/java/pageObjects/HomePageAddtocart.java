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


    public String setNameProduct(){
         Element nameProduct = new Element(By.xpath("//div[text()='Sauce Labs Backpack']"));
        nameProduct.getText();
        return nameProduct.getText();
    }

    public String setTextProduct(){
        Element textProduct = new Element(By.xpath("//div[@class='inventory_item_desc']"));
        textProduct.getText();
        return textProduct.getText();
    }


    public String setpriceProduct(){
        Element priceProduct = new Element(By.xpath("//div[@class='inventory_item_price']"));
        priceProduct.getText();
        return priceProduct.getText();
    }


}
