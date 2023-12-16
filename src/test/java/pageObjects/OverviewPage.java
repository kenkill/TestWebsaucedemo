package pageObjects;

import core.element.Element;

public class OverviewPage {
    private Element finishButton = new Element("//a[contains(text(),'FINISH')]");
    public void getFinishButton(){
        finishButton.click();
    }
}
