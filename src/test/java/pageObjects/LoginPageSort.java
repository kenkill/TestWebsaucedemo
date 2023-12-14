package pageObjects;

import core.element.Element;
import org.openqa.selenium.By;

public class LoginPageSort {
    private Element userInput = new Element(By.xpath("//input[@id='user-name']"));
    private Element passInput = new Element(By.xpath("//input[@id='password']"));
    private Element loginButton = new Element(By.xpath("//input[@id='login-button']"));
    public void signin(String userIp, String passIp) {
        userInput.sendKeys(userIp);
        passInput.sendKeys(passIp);
        loginButton.moveToElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }
}
