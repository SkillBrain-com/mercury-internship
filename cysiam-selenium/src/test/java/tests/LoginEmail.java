package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ChooseEmailPage;
import pages.EmailLoginPage;

import java.util.Set;

import static utils.EmailData.EMAIL_PASSWORD;
import static utils.EmailData.EMAIL_USERNAME;

public class LoginEmail extends EmailTest {

    @Test
    public void LoginEmail() throws InterruptedException {

        driver.manage().window().maximize();
        Thread.sleep(1000);

        EmailLoginPage signInPage = PageFactory.initElements(driver, EmailLoginPage.class);
        Thread.sleep(500);
        EmailLoginPage.getSignInButton().click();
        Thread.sleep(500);

     //SE FACE FOCUS PE NOUA PAGINA CA SA NU PIERDEM ETAPELE DE LOGARE

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles){
            if ( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }

        ChooseEmailPage chooseEmailPage = PageFactory.initElements(driver, ChooseEmailPage.class);
        Thread.sleep(1000);

        ChooseEmailPage.getUserName().sendKeys(EMAIL_USERNAME);
        Thread.sleep(1000);

        EmailLoginPage.getNextButton().click();

        ChooseEmailPage.getPassword().sendKeys(EMAIL_PASSWORD);
        Thread.sleep(1000);

        EmailLoginPage.getSignInButton1().click();
        Thread.sleep(1000);

        EmailLoginPage.getBackButton().click();
        Thread.sleep(1500);

        EmailLoginPage.getClickCysiamIcon().click();
        Thread.sleep(1500);

        EmailLoginPage.getClickEmail().click();
        Thread.sleep(30000);

        SoftAssert softAssert = new SoftAssert();
        WebElement message1 = driver.findElement (By.id("x_BodyPlaceholder_UserVerificationEmailBodySentence2"));
        softAssert.assertEquals(message1.getText(),"Your code is: xxxxxx","Test 1 - elementul nu exista, test invalid");
        System.out.println(message1.getText());
//        System.out.println(message1.getAttribute("title = "));

        Thread.sleep(5000);




        // or any locator strategy that you find suitable
        WebElement verifyCode = driver.findElement(By.id("verify code"));
        Actions act = new Actions(driver);
        act.moveToElement(verifyCode).doubleClick().build().perform();

// now apply copy command
        driver.findElement(By.id("")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
// now apply the command to paste
        driver.findElement (By.xpath("")).sendKeys(Keys.chord(Keys.CONTROL, "v"));

        driver.quit();
}
}



