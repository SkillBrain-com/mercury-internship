package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "/html/body/header/div[1]/div/div/div/div/div[2]/div/div[3]/div[1]/div/a")
    private static WebElement signInButton;

    public static WebElement getSignInButton() { return signInButton; }

//---------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"login-signin\"]")
    private static WebElement signInButton1;

    public static WebElement getSignInButton1() { return signInButton1; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"login-signin\"]")
    private static WebElement signInButton2;

    public static WebElement getSignInButton2() { return signInButton2; }

//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath ="//*[@id=\"ybar-navigation-item-mail\"]/a")
    private static WebElement signInButton3;

    public static WebElement getSignInButton3() { return signInButton3; }


}
