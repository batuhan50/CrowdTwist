package Utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @FindBy(css = "[title='View my shopping cart']")
    public WebElement cart;

public BasePage(){
     PageFactory.initElements(Driver.getDriver("chrome"),this);
 }

}
