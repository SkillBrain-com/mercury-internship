package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseYourAccount {

// realizam constructorul pentru driverul din pagina noastra
    public ChooseYourAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

// ---------------------------------------------------------------------------
    @FindBy(id = "email")
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

// ---------------------------------------------------------------------------
    @FindBy(id = "password")
    private static WebElement password;
    public static WebElement getPassword() { return password; }

// ---------------------------------------------------------------------------

    @FindBy (id="next")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton;  }
}
