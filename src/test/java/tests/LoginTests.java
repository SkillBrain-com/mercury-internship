package tests;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest{
    @Test(description = "verify login is successful with a correct username and password")
    public void testValidLogin(){
        driver.get("https://admin-demo.nopcommerce.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getEmail().sendKeys("admin@yourstore.com");
        loginPage.getPassword().sendKeys("admin");
        loginPage.getLoginForm().submit();

                assertTrue(driver.getCurrentUrl().contains("/admin/") ,
                       "Login was unsuccessful with the default data");

    }
}
