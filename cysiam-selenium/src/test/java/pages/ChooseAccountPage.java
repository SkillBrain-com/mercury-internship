package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseAccountPage {

// realizam constructorul pentru driverul din pagina noastra
    public ChooseAccountPage(WebDriver driver){ PageFactory.initElements(driver, this); }


    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[2]/form/div[3]/button")
    private static WebElement signInCysiam;
    public static WebElement getSignInCysiam() { return signInCysiam; }


// ---------------------------------------------------------------------------
    @FindBy(id = "email")
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

// ---------------------------------------------------------------------------
    @FindBy(id = "password")
    private static WebElement password;
    public static WebElement getPassword() { return password; }

//----------------------------------------------------------------------------

 @FindBy(id = "next")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton; }














// ---------------------------------------------------------------------------

//    @FindBy (xpath = "//*[@id=\"next\"]")
//    private static WebElement signInButton;
//    public static WebElement getSignInButton() { return signInButton;  }
//
////----------------------------------------------------------------------------
//
//    @FindBy ( xpath = "//*[@id=\"ReadOnlyEmail_ver_but_send\"]")
////  //*[@id="ReadOnlyEmail_ver_but_send"]
////  //*[@id="attributeList"]/ul/li/div/div[3]
//
//    private static WebElement sendVerificationCode;
//    public static WebElement getSendVerificationCode() { return sendVerificationCode;  }
//
////------------------------------------------------------------------------------
//
//    @FindBy (xpath = "//*[@id=\"ReadOnlyEmail_ver_but_verify\"]")
//    private static WebElement verifyCode;
//    public static WebElement getVerifyCode() { return verifyCode;  }
//
////----------------------------------------------------------------------------------------------------------------------
//
//    @FindBy (xpath = "//*[@id=\"attributeVerification\"]/div[6]")
////
////  //*[@id="continue"]
//    private static WebElement continueButton;
//    public static WebElement getContinueButton() { return continueButton;  }
//


}
