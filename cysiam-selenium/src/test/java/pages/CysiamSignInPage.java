package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CysiamSignInPage {

    public CysiamSignInPage (WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/form/div[3]/button")
    private WebElement signInButton;

    public WebElement getSignInButton() {

        return signInButton;
    }
    //
}
