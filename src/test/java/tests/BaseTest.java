package tests;

import drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.TestData;

public class BaseTest {

    ChromeDriver driver;

    @BeforeMethod
    public void before(){

        driver = DriverManager.getDriver();
        driver.get(TestData.APP_URL);
    }

    @AfterMethod
    public void after(){
        if (driver == null){
            driver.quit();
        }
    }

 }
