package Scenarios;


import Common.BasetTest;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BasetTest {

    @Test
    public void HomePageTest(){
        LoginPage.enterUserName("jacob");
        LoginPage.enterPassword("jacob");
        LoginPage.clickOnLogin();
    }
}
