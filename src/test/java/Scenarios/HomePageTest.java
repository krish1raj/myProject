package Scenarios;


import Common.BasetTest;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BasetTest {

    @Test
    public void HomePageTest(){
        LoginPage.enterUserName("jacob");
        LoginPage.enterPassword("jacob");
        LoginPage.clickOnLogin();
        HomePage.logout();
    }
}
