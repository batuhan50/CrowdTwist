package Pages;

import Utilities.BasePage;
import Utilities.Driver;
import Utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class OrderHistoryPage extends BasePage {

  String actualSku;
  String actualPrice;
  WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
  Pages pages = new Pages();

  @FindBy(id = "order-list")
    public WebElement table;

  @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    public WebElement firstDetailsButton;


  @FindBy(className = "first_item")
  public WebElement firstRow;

  @FindBy(id = "order-detail-content")
  public WebElement detailsTable;

  @FindBy(css = "[class='totalprice item']>td:nth-child(2)")
  public WebElement totalInDetails;

  @FindBy(css = "[class='item']>:nth-child(1)>label")
  public WebElement skuInDetails;

  @FindBy(css = "[class='bold']>label")
  public WebElement product;
  @FindBy(xpath = "//*[@id='center_column']/div/text()[11]")
  public WebElement orderCode;


  public void checkDetails(){



     firstDetailsButton.click();



     wait.until(ExpectedConditions.visibilityOf(skuInDetails));
     actualSku= skuInDetails.getText();

    Assert.assertEquals(pages.checkOutPage().SKUNum,actualSku);

    System.out.println("YOU SUCCESSFULLY BOUGHT !!!");



  }


}
