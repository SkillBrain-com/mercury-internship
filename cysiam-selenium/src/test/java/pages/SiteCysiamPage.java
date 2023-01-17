package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiteCysiamPage {

    public SiteCysiamPage(WebDriver driver){ PageFactory.initElements(driver, this); }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div/ul/a[10]/li/div/div[2]/span")
    private static WebElement clickToSettings;
    public static WebElement getClickToSettings() { return clickToSettings;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div/ul/a[1]/li/div/div[1]/span")
    private static WebElement clickToOverview;
    public static WebElement getClickToOverview() { return clickToOverview;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"__next\"]/div[2]/div/ul/a[4]/li/div/div[1]")
    private static WebElement clickToQuestions;
    public static WebElement getClickToQuestions() { return clickToQuestions;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[6]/div/div/a/span")
    private static WebElement clickToArrow;
    public static WebElement getClickToArrow() { return clickToArrow;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\":rt:\"]")
    private static WebElement clickToHelpNotes;
    public static WebElement getClickToHelpNotes() { return clickToHelpNotes;  }

//----------------------------------------------------------------------------------------------------------------------

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div[2]/form/div[5]/button[2]")
    private static WebElement clickToSaveQuestion;
    public static WebElement getClickToSaveQuestion() { return clickToSaveQuestion;  }

//----------------------------------------------------------------------------------------------------------------------
//    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/div[1]/a/div/div/img ")
//    private static WebElement clickToImagePATHWAY;
//    public static WebElement getClickToImagePATHWAY() { return clickToImagePATHWAY;  }

}
