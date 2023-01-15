package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseEmailPage {

    public ChooseEmailPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

// ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"i0116\"]")
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

// ---------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"i0118\"]")
    private static WebElement password;
    public static WebElement getPassword() { return password; }

// ---------------------------------------------------------------------------















//
//
//    @FindBy (xpath = "/html/body/header/div/aside/div/nav/ul/li[2]/a")
//    private static WebElement signInButton;
//    public static WebElement getSignInButton() { return signInButton;  }
//
////----------------------------------------------------------------------------
//
//    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
//    private static WebElement nextButton;
//
//    public static WebElement getNextButton() { return nextButton; }
//
////-----------------------------------------------------------------------------
//
//    @FindBy(id = "lightbox")
//    private static WebElement clickButton;
//
//    public static WebElement getClickButton() { return clickButton; }
//
////-----------------------------------------------------------------------------
//    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
//    private static WebElement signInButton1;
//
//    public static WebElement getSignInButton1() { return signInButton1; }
//
////-----------------------------------------------------------------------------
//
//    @FindBy(xpath = "//*[@id=\"idBtn_Back\"]")
//    private static WebElement BackButton;
//
//    public static WebElement getBackButton() { return BackButton; }
//
////------------------------------------------------------------------------------
//
//    @FindBy(xpath = "//*[@id=\"AQAAAAAAAQwBAAAGUv6f2AAAAAA=\"]/div/div")
////  //*[@id="AQAAAAAAAQwBAAAGUv6f2AAAAAA="]/div/div/div[1]
//    private static WebElement clickEmail;
//
//    public static WebElement getClickEmail() { return clickEmail; }
//
////------------------------------------------------------------------------------
//





//    @FindBy (id = "ReadOnlyEmail_ver_but_send")
//    private static WebElement verificationCode;
//    public static WebElement getVerificationCode() { return verificationCode;  }



}
