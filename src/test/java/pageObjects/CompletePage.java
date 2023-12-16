package pageObjects;

import core.element.Element;

public class CompletePage {
    private Element textComplete = new Element("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
    public String TextComplete(){
        textComplete.getText();
        return  textComplete.getText();
    }
}
