package Scenarios;


import Common.BasetTest;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BasetTest {

    @Test
    public void loginTest(){
        LoginPage.clickOnSignIn();
        LoginPage.enterUserName();
        LoginPage.clickOnLogin();
        HomePage.verifyUser();
    }
}
