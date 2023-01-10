package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CysiamLoginPage {

    public CysiamLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/form/div[3]/button")

    private static WebElement signInButton;

    public static WebElement getSignInButton() { return signInButton; }


}
