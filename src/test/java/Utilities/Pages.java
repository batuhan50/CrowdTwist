package Utilities;

import  Pages.*;

public class Pages{

    private CheckOutPage  checkOutPage;
    private  DressesPage dressesPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private  Model_demo4Page model_demo4Page;
    private OrderHistoryPage orderHistoryPage;


    public CheckOutPage checkOutPage(){
        if(checkOutPage==null){
            checkOutPage=new CheckOutPage();
        }
        return checkOutPage;
    }

    public DressesPage dressesPage(){
        if(dressesPage==null){
           dressesPage = new DressesPage();
        }
        return dressesPage;
    }



    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage();
        }
        return homePage;
    }



    public LoginPage loginPage(){
        if(loginPage==null){
           loginPage = new LoginPage();
        }
        return loginPage;
    }



    public Model_demo4Page model_demo4Page(){
        if(model_demo4Page==null){
            model_demo4Page = new Model_demo4Page();
        }
        return model_demo4Page;
    }

    public OrderHistoryPage orderHistoryPage(){
        if(orderHistoryPage==null){
            orderHistoryPage=new OrderHistoryPage();
        }
        return orderHistoryPage;
    }
}
