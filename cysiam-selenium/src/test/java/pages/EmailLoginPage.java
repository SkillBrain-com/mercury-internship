package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailLoginPage {

    public EmailLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "/html/body/header/div/aside/div/nav/ul/li[2]/a")
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton; }

//---------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
    private static WebElement nextButton;
    public static WebElement getNextButton() { return nextButton; }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"idSIButton9\"]")
    private static WebElement signInButton1;

    public static WebElement getSignInButton1() { return signInButton1; }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"idBtn_Back\"]")
    private static WebElement BackButton;

    public static WebElement getBackButton() { return BackButton; }

//----------------------------------------------------------------------------------------------------------------------

//  Accesam folderul de Cysiam din EMAIL:
    @FindBy(xpath = "//*[@id=\"MainModule\"]/div/div/div[1]/div/div/div[1]/div/div[2]/div[2]/div/span[1]")
    private static WebElement clickCysiamIcon;
    public static WebElement getClickCysiamIcon() { return clickCysiamIcon; }



//----------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@id=\"AQAABlL+5d8BAAAGVzAF0QAAAAA=\"]/div/div/div[1]/div[1]/div")
    private static WebElement clickEmail;
    public static WebElement getClickEmail() { return clickEmail; }

//----------------------------------------------------------------------------------------------------------------------

}
