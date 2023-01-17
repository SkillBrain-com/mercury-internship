package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChooseSitePage {

    public ChooseSitePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

//----------------------------------------------------------------------------------------------------------------------

//    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/header/div/div[1]/button/span")
//    //*[@id="__next"]/div[2]/div/ul/a[1]/li/div
//
//    private static WebElement Overview;
//    public static WebElement getLabelOverview() { return Overview; }


    public final static String Overview = "Overview";



}
