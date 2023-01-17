package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {

    public UserDetailsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//----------------------------------------------------------------------------

    @FindBy ( id = "ReadOnlyEmail_ver_but_send")
//  xpath = "//*[@id="ReadOnlyEmail_ver_but_send"]"
    private static WebElement sendVerificationCode;
    public static WebElement getSendVerificationCode() { return sendVerificationCode;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"ReadOnlyEmail_ver_but_verify\"]")
    private static WebElement verifyCode;
    public static WebElement getVerifyCode() { return verifyCode;  }

//---------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"attributeVerification\"]/div[6]")
//
//  //*[@id="continue"]
    private static WebElement continueButton;
    public static WebElement getContinueButton() { return continueButton;  }

//----------------------------------------------------------------------------------------------------------------------






//
//
//
//
//
//
//
//
//
//
//
//
//    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div/ul/a[4]/li/div/div[2]")
////  //*[@id="__next"]/div[2]/div/ul/a[4]
////  //*[@id="__next"]/div[2]/div/ul/a[4]/li
////  //*[@id="__next"]/div[2]/div/ul/a[4]/li/div/div[1]
////  //*[@id="__next"]/div[1]/header/div
////  //*[@id="__next"]/div[2]/div/ul/a[4]/li/div
////  //*[@id="__next"]/div[2]/div/ul/a[4]/li/div/div[2]/span
////
//
//
//    private static WebElement clickToQuestions;
//    public static WebElement getClickToQuestions() { return clickToQuestions;  }
//
////----------------------------------------------------------------------------------------------------------------------
//
//    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[6]/div/div/a/span")
//    private static WebElement clickToArrow;
//    public static WebElement getClickToArrow() { return clickToArrow;  }
//
////----------------------------------------------------------------------------------------------------------------------
//
//    @FindBy (xpath = "//*[@id=\":rt:\"]")
//    private static WebElement clickToHelpNotes;
//    public static WebElement getClickToHelpNotes() { return clickToHelpNotes;  }
//
////----------------------------------------------------------------------------------------------------------------------
//
//    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div[2]/form/div[5]/button[2]")
//    private static WebElement clickToSaveQuestion;
//    public static WebElement getClickToSaveQuestion() { return clickToSaveQuestion;  }
//
////----------------------------------------------------------------------------------------------------------------------
//

}
