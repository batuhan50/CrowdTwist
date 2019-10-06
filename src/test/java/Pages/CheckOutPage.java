package Pages;

import Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {

    String SKUNum="demo_4";
    String colorAndSize="";
    String totalPriceOfOrder="";

   @FindBy(id = "id_address_delivery")
    public WebElement adressDropDown;

   @FindBy(id="cgv")
    public WebElement shippingTermsAndConditions;

   @FindBy(className = "fancybox-error")
    public WebElement termsAndConditionsAlert;
   @FindBy(className = "cart_ref")
   public WebElement sku;
   @FindBy(xpath = "//a[contains(text(),'Color')]")
   public WebElement colorSize;
   @FindBy(xpath ="(//span[contains(text(),'Proceed to checkout')])[2]")
   public WebElement proceedToCheckOut;
   @FindBy(id = "total_price")
   public WebElement totalPrice;
   @FindBy(className = "bankwire")
   public WebElement bankWire;
   @FindBy(className = "cheque")
   public WebElement payByCheck;
   @FindBy(css = "[class='button btn btn-default button-medium']")
   public WebElement confirmOrder;
   @FindBy(css = "[title='Back to orders']")
   public WebElement backToOrders;


   public void buyItem() {
       proceedToCheckOut.click();
       Select select = new Select(adressDropDown);

       if (select.getFirstSelectedOption().getText().contains("My address")) {

           proceedToCheckOut.click();

       } else {

           System.out.println(select.getFirstSelectedOption().getText());
       }
       //proceedToCheckOut.click();
       if (shippingTermsAndConditions.isSelected()) {
           proceedToCheckOut.click();

       } else {
           shippingTermsAndConditions.click();
           proceedToCheckOut.click();

       }




       bankWire.click();
       confirmOrder.click();

   }
   public void backToOrders(){

       backToOrders.click();
   }
}
