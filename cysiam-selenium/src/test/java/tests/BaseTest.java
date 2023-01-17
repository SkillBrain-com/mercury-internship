package tests;


//import driver.DriverManager;
import drivers.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.TestData;

public class BaseTest {

// instantiere driverul - facem clasa ChromeDriver
    ChromeDriver driver;
// utilizam Before si After methode

    @BeforeMethod
    public void before(){
// apelam DRIVER-UL
        driver = DriverManager.getDriver();

//  apelam URL-ul pe care dorim sa-l testam
//  driver.get("https://cysiam-client-docker.azurewebsites.net/auth/sign-in");
//  sau facem apelare din TestData cu valorile definite acolo

        driver.get(TestData.APP_URL);
}

    @AfterMethod
    public void after(){
        if (driver == null){
         driver.quit();
        }
    }

}
