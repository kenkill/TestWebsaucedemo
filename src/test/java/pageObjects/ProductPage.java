package pageObjects;

import core.element.Element;
import org.openqa.selenium.By;

public class ProductPage {
    public String setPriceProduct(){
        Element priceProduct = new Element(By.xpath("//div[@class='inventory_item_price']"));
        priceProduct.getText();
        return priceProduct.getText();
    }
    public String setTextProduct(){
        Element textProduct = new Element(By.xpath("//div[@class='inventory_item_desc']"));
        textProduct.getText();
        return textProduct.getText();
    }
    public String setNameProduct(){
        Element nameProduct = new Element(By.xpath("//div[text()='Sauce Labs Backpack']"));
        nameProduct.getText();
        return nameProduct.getText();
    }
    private Element checkoutButton = new Element(By.xpath("//a[contains(text(),'CHECKOUT')]"));
    public void getCheckoutButton(){
        checkoutButton.click();
    }
}
