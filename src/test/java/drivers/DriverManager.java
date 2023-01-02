package drivers;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    public static ChromeDriver getDriver()  {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        ChromeDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
