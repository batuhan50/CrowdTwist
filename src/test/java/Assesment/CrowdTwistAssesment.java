package Assesment;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import Utilities.Pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrowdTwistAssesment {


    static WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();

     driver = Driver.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
    }

    Pages pages = new Pages();

    @Test(priority = 0)
    public  void login(){


       pages.loginPage().login(ConfigurationReader.getProperty("useremail"),"Hamza!2014");

    }
    @Test(priority = 1)
    public void navigateToDresses(){

        pages.homePage().navigateToDressPage();
    }

    @Test(priority = 2)
    public  void addToCartAndBuy(){

        pages.dressesPage().addToCard(pages.dressesPage().printedDress);
        pages.model_demo4Page().selectSizeandAddToCart("M");
        pages.checkOutPage().buyItem();


    }
    @Test(priority = 3)
    public void checkOrderBoughtOrNot(){

        pages.checkOutPage().backToOrders();
        pages.orderHistoryPage().checkDetails();



    }

    @AfterTest
    public void tearDown(){
        Driver.getDriver("chrome").quit();
    }


}

