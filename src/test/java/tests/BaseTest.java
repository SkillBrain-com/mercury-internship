package tests;

import driver.BrowserConfigs;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected ChromeDriver driver = null;


    @BeforeClass
    public void beforeClass(){
        driver = BrowserConfigs.getChromeDriver();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        if (driver != null){
            driver.quit();
        }
    }

}
