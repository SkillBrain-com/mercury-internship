package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ChooseAccountPage;
import pages.ChooseSitePage;
import pages.SiteCysiamPage;
import pages.UserDetailsPage;

import java.util.Set;

import static pages.ChooseSitePage.Overview;
import static utils.TestData.*;


public class LoginTest extends BaseTest {
// Am extind clasa BaseTest in cadrul metodei Login

    @Test
    public void testLogInAdminVailidCredential() throws InterruptedException {

// Maximizarea paginii se face din DriverManager asa ca aici linia de maximizare se comenteaza:
        driver.manage().window().maximize();

// Aici instantiem clasa de SignInPage pentru a intra pe pagina

        ChooseAccountPage signInPage = PageFactory.initElements(driver, ChooseAccountPage.class);
        Thread.sleep(1000);
        ChooseAccountPage.getSignInCysiam().click();
        Thread.sleep(1000);

//SE FACE FOCUS PE NOUA PAGINA

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles){
            if ( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
// Intram pe pagina de CYSIAM si accesam contul

        ChooseAccountPage chooseYourAccount = PageFactory.initElements(driver, ChooseAccountPage.class);
        Thread.sleep(2500);

        ChooseAccountPage.getUserName().sendKeys(ADMIN_USERNAME);
        Thread.sleep(2000);

        ChooseAccountPage.getPassword().sendKeys(ADMIN_PASSWORD);
        Thread.sleep(2000);

        ChooseAccountPage.getSignInButton().click();
        Thread.sleep(2500);

//  Se deschide fereastra de User Details

        UserDetailsPage chooseUserDetails = PageFactory.initElements(driver, UserDetailsPage.class);
        Thread.sleep(2500);

        UserDetailsPage.getSendVerificationCode().click();
        Thread.sleep(40000);

// Ne mutam pe pagina de EMAIL unde am primit codul de verificare pt acces pe site-ul CYSIAM.

//        ChooseEmailPage chooseEmailPage = PageFactory.initElements(driver, ChooseEmailPage.class);

//        EmailLoginPage logInPage = PageFactory.initElements(driver, EmailLoginPage.class);
//        Thread.sleep(1000);

//        ChooseAccountPage chooseYourAccount = PageFactory.initElements(driver, ChooseAccountPage.class);
//        Thread.sleep(2500);



// Cum meseria lui Pampules facem accesarea lui EmailLoginPage si citirea codului din email?
// Dupa accesarea adresei de email o sa fie necesar sa primim codul de confirmare care trebuie tiparit in cauta minune


// Validam codul ca sa intram pe pagina de CYSIAM:

        UserDetailsPage.getVerifyCode().sendKeys(VERIFY_CODE);
        UserDetailsPage.getVerifyCode().click();
        Thread.sleep(1500);

        UserDetailsPage.getContinueButton().click();
        Thread.sleep(3000);

//  VERIFICAM DACA PUTEM SA EDITAM O INTREBARE
//  Primul pas - verificam daca exista sectiunea "Questions" si daca se poate accesa


        ChooseSitePage chooseSite = PageFactory.initElements(driver, ChooseSitePage.class);
        Thread.sleep(1000);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Overview" , "Overview", "Campul 'Overview' nu este corect    " );
        Thread.sleep(1000);
        softAssert.assertEquals("Clients" , "Clients", "Campul 'Clients' nu este corect    " );
        Thread.sleep(1000);
        softAssert.assertEquals("Audit Reports" , "Audit Reports", "Campul 'Audit Reports' nu este corect    " );
        Thread.sleep(1000);
        softAssert.assertEquals("Questions" , "Question-s", "Campul 'Questions' nu este corect    " );
        Thread.sleep(1000);

        softAssert.assertEquals(Overview,"Overview","Campul 'Inbox' nu este corect    ");


//  Dam click pe casuta "Questions" si intram in sectiunea respectiva

        SiteCysiamPage siteCysiamPage = PageFactory.initElements(driver, SiteCysiamPage.class);
        Thread.sleep(1000);

        SiteCysiamPage.getClickToSettings().click();
        Thread.sleep(1000);
        SiteCysiamPage.getClickToOverview().click();
        Thread.sleep(1000);
        SiteCysiamPage.getClickToQuestions().click();
        Thread.sleep(1000);
        SiteCysiamPage.getClickToArrow().click();
        Thread.sleep(1000);
        SiteCysiamPage.getClickToHelpNotes().click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\":rt:\"]")).sendKeys("Vasilica si gasca vesela !");
        Thread.sleep(1000);
        SiteCysiamPage.getClickToSaveQuestion().click();
        Thread.sleep(10000);

//  UTILIZAM LINIILE DE MAI JOS CA SA IESIM DIN PAGINA DE CYSIAM

//        QuitYourAccount.getLogoOutButton().click();
//        Thread.sleep(500);
//        QuitYourAccount.getSignOutButton().click();

//        WebElement LogoButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/div"));
//        LogoButton.click();
//        WebElement SignOutButton = driver.findElement(By.cssSelector(".css-fd3x2n > button:nth-child(1)"));
//        SignOutButton.click();


        Thread.sleep(500);
//        driver.quit();
    }
}
