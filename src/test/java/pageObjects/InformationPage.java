package pageObjects;

import core.element.Element;
import org.openqa.selenium.By;

public class InformationPage {
    private Element firstNameInput = new Element(By.xpath("//input[@id='first-name']"));
    public void getFirstNameInput(){
        firstNameInput.sendKeys("duy");
    }

    private Element lastNameInput = new Element(By.xpath("//input[@id='last-name']"));
    public void getLastNameInput(){
        lastNameInput.sendKeys("le");
    }

    private Element postalCodeInput = new Element(By.xpath("//input[@id='postal-code']"));
    public void getPostalCodeInput(){
        postalCodeInput.sendKeys("1234");
    }

    private Element continueButton = new Element(By.xpath("//input[@type='submit']"));
    public void getContinueButton(){
        continueButton.click();
    }

}
