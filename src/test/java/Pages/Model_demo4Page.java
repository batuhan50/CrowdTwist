package Pages;

import Utilities.BasePage;
import Utilities.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Model_demo4Page extends BasePage {


    @FindBy(id = "group_1")
    public WebElement sizeDropDown;


    @FindBy(css = "[title='Pink']")
    public WebElement colorOptionPink;

    @FindBy(css = "[title='Beige']")
    public WebElement colorOptionBeige ;

    @FindBy(css = "[class='icon-plus']")
    public WebElement increaseQuantity;

    @FindBy(css = "[class='icon-minus']")
    public WebElement DecreaseQuantity;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public WebElement addToCart;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement proceedToCheckOut;


    public void selectSizeandAddToCart(String size){
        Select select = new Select(sizeDropDown);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"S");
        select.selectByVisibleText(size);
        addToCart.click();
        proceedToCheckOut.click();


    }
}
