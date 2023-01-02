package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuitYourAccount {
    public QuitYourAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//----------------------------------------------------------------------------------------------

    @FindBy(id="ybarAccountMenu")
    private static WebElement logoOutButton;
    public static WebElement getLogoOutButton() { return logoOutButton;  }

//----------------------------------------------------------------------------------------------

    @FindBy(xpath="//*[@id=\"profile-signout-link\"]/span[2]")
    private static WebElement signOutButton;
    public static WebElement getSignOutButton() { return signOutButton;  }







}
