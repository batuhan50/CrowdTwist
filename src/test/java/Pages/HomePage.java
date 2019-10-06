package Pages;

import Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "[class='login']")
    public WebElement signIn;

    @FindBy(xpath = "(//*[text()='Dresses'])[2]")
    public WebElement dressesTab;


    public void navigateToDressPage(){
        dressesTab.click();


    }


}
