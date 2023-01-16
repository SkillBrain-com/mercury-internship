package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CysiamChooseAccountPage {


    @FindBy(css = "#email")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(css = "#next")
    private WebElement signInButton;

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
    //
}
