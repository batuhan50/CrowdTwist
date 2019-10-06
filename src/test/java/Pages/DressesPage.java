package Pages;

import Utilities.BasePage;
import Utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends BasePage {

    @FindBy(xpath = "(//*[@class='left-block'])[2]")
    public WebElement printedDress;

    @FindBy(xpath = "(//span[text()='More'])[2]")
    public WebElement more;

    public void addToCard(WebElement item ){
        Actions action = new Actions(Driver.getDriver("chrome"));
        action.moveToElement(item).perform();
       more.click();

    }



}
