package tests;


import drivers.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.EmailData;

public class EmailTest {

    // instantiere driverul - facem clasa ChromeDriver
    ChromeDriver driver;
// utilizam Before si After methode

    @BeforeMethod
    public void before(){

        driver = DriverManager.getDriver();

        driver.get(EmailData.APP_URL_EMAIL);
    }

    @AfterMethod
    public void after(){
        if (driver == null){
            driver.quit();
        }
    }
}
