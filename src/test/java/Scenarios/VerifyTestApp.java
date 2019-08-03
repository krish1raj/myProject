package Scenarios;


import Common.BasetTest;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.testng.annotations.Test;

public class VerifyTestApp extends BasetTest {

    @Test
    public void HomePageTest(){
       driver.get("https://qaapimgnt2.azure-api.net/jacob?param1=sample&subscription-key=d0bf597bc4de48489629b072b430f39f");
    }
}
