package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.ChooseYourAccount;
import pages.CysiamLoginPage;

import java.util.Set;

import static utils.TestData.ADMIN_PASSWORD;
import static utils.TestData.ADMIN_USERNAME;

public class LoginTest extends BaseTest {
// Am extind clasa BaseTest in cadrul mmetodei Login

    @Test
    public void testLogInAdminVailidCredential() throws InterruptedException {

// Maximizarea paginii se face din DriverManager asa ca aici linia de maximizare se comenteaza:
        driver.manage().window().maximize();

// Aici instantiem clasa de SignInPage pentru a intra pe pagina

       CysiamLoginPage signInPage = PageFactory.initElements(driver, CysiamLoginPage.class);
        Thread.sleep(2000);
        CysiamLoginPage.getSignInButton().click();
        Thread.sleep(2000);

//SE FACE FOCUS PE NOUA PAGINA

        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Thread.sleep(2000);

        for (String window: windowHandles){
            if ( !window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
// Pentru a verifica ca suntem pe pagina respectiva, facem CLICK pe un element inactiv , pt siguranta - nu este obligatoriu dar e mai SANATOS!

//        WebElement SignIn_Page = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/img"));
//        SignIn_Page.click();
//        Thread.sleep(1000);

        ChooseYourAccount chooseYourAccounthooseYourAccount = PageFactory.initElements(driver, ChooseYourAccount.class);
        Thread.sleep(500);

        ChooseYourAccount.getUserName().sendKeys(ADMIN_USERNAME);
        Thread.sleep(500);

        ChooseYourAccount.getPassword().sendKeys(ADMIN_PASSWORD);
        Thread.sleep(500);

// liniile de mai sus se pot genera la fel cum sunt cele de mai jos
//        driver.findElement(By.id("email")).sendKeys("adminbrain5@test.com");
//        driver.findElement(By.id("password")).sendKeys("Parola12#");
//        Thread.sleep(1000);

        ChooseYourAccount.getSignInButton().click();

//      este obligatoriu pentru orice test sa contina verificari ( ASSERT.EQUALS, ETC.  ) - ACEATSA E ZONA DE ASSERT-uri

//        List<WebElement> cards = driver.findElements(By.className("card"));
//        assertEquals(cards.size(),4,"Wrong label size, not equal 4");
//        List<WebElement> labels = driver.findElements(By.id("label"));
//        assertEquals(labels.size(),4,"Wrong label size, not equal 4");



        Thread.sleep(10000);

//        QuitYourAccount.getLogoOutButton().click();
//        Thread.sleep(500);
//        QuitYourAccount.getSignOutButton().click();
//  SAU UTILIZAM LINIILE DE MAI JOS CA SA IESIM DIN PAGINA DE CYSIAM
//        WebElement LogoButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/div"));
//        LogoButton.click();
//        WebElement SignOutButton = driver.findElement(By.cssSelector(".css-fd3x2n > button:nth-child(1)"));
//        SignOutButton.click();
//        Thread.sleep(1000);
        Thread.sleep(25000);
//        driver.quit();
    }
}
