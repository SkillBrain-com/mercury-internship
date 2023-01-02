package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.ChooseYourAccount;
import pageObjects.QuitYourAccount;
import pageObjects.SignInPage;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static utils.TestData.*;

public class LoginTestLogoutPage extends BaseTest{

    @Test
    public void testLogInAdminVailidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);
        SignInPage.getSignInButton().click();
        Thread.sleep(1000);

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        ChooseYourAccount chooseYourAccount = PageFactory.initElements(driver, ChooseYourAccount.class);
        Thread.sleep(500);

        ChooseYourAccount.getUserName().sendKeys(ADMIN_USERNAME);
        SignInPage.getSignInButton1().click();
        Thread.sleep(500);

        ChooseYourAccount.getPassword().sendKeys(ADMIN_PASSWORD);
        SignInPage.getSignInButton2().click();
        Thread.sleep(500);

        ChooseYourAccount.getMail().sendKeys(MAIL_BOX);
        SignInPage.getSignInButton3().click();
        Thread.sleep(500);

//        WebElement EliminatePopUp = driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div/div[1]/div"));
//        EliminatePopUp.click();
//        Thread.sleep(500);

//  1) Facem verificarea ca pe pagina de logare avem un numar de 1+8 carduri ( "a class" - uri) - folosim ASSERT

//        List<WebElement> cards = driver.findElements(By.className("card"));
//        assertEquals(cards.size(), 9, "Valoare incorecta a numarului de carduri estimata");
//        Thread.sleep(5000);

//  Sau varianta 2

//        List<WebElement> aClass = driver.findElements(By.className("a class"));
//        assertEquals(aClass.size(), 9, "Valoare incorecta a numarului de carduri estimata");
//        assert By.xpath ("//*[@id="app"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[1]/span")


//  2) Facem verificarea ca pe pagina de logare avem un numar de 1+8 carduri ( "a class" - uri) - folosim softASSERT
//  Definim o variabila de softAssert si il iniutializam cu un obiect now ( NEW ) de softassert

        SoftAssert softAssert = new SoftAssert();

        WebElement message1 = driver.findElement (By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[1]"));
        softAssert.assertEquals(message1.getText(),"Inbox","Elementul nu exista");
        System.out.println("Aici e testul pt message1 \n");
        Thread.sleep(500);

        WebElement message2 = driver.findElement (By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div"));
        softAssert.assertEquals(message2.getText(),
                "Yahoo Mail \n" +
                "Advanced \n" +
                "Cristian \n" +
                "Home \n",
                "Elementele exista grupate pe linii");
        System.out.println("Aici e testul pt message2 \n");
        Thread.sleep(500);

        WebElement message3 = driver.findElement (By.xpath("//*[@id=\"ybar-inner-wrap\"]/div[2]/div"));
        softAssert.assertEquals("Yahoo Mail" , "Yahoo Mail" );
        softAssert.assertEquals("Advanced" , "Advanced" );
        softAssert.assertEquals("Cristian " , "Cristian " );
        softAssert.assertEquals("Home" , "Home" );
        softAssert.assertEquals(message3.getText(), "Yahoo Mail " + "Advanced " + "Cristian " + "Home ");
        System.out.println("Aici e testul pt message3 \n");
        System.out.println("\n");

//        softAssert.assertEquals(message2.getText(),"Advanced","Incorect, elementul nu exista");
//        softAssert.assertEquals(message2.getText(),"Cristian","incorect, elementul nu exista");
//        softAssert.assertEquals(message2.getText(),"Home","Incorect, elementul nu exista");
//        softAssert.assertAll();

        Thread.sleep(1000);

//        QuitYourAccount.getLogoOutButton().click();
//        Thread.sleep(500);
//        QuitYourAccount.getSignOutButton().click();

        driver.close();
        driver.quit();

        softAssert.assertAll();
    }

}
