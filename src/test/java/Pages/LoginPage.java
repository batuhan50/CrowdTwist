package Pages;

import Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {


    @FindBy(id = "email")
        public  WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(css = "p>button>span>i")
    public WebElement loginButton;

    @FindBy(css = "[class='login']")
    public WebElement signInButton;




    public void login(String userName , String password){

         signInButton.click();
         email.sendKeys(userName);
         this.password.sendKeys(password);
         loginButton.click();

    }

}
