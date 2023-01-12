package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SidebarPage;

public class SearchTests extends BaseTest{

    @BeforeClass
    public void beforeClass(){
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getLoginForm().submit();

    }

    @Test(description = "Verify that search is successful when searching for products by name")
    public void testSearchByProductName(){
        SidebarPage sidebarPage = new SidebarPage(driver);
//        SidebarPage.getCatalogLink().click();
//        SidebarPage.getProductList().click();

    }
}
