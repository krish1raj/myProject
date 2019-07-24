package PageObjects;


import Common.BasetTest;

public class LoginPage extends BasetTest {

    public static void clickOnLogin(){
        driver.findElement(signIn).click();

    }
    public static void enterUserName(){
        driver.findElement(email).click();
    }
    public static void clickOnSignIn(){
        driver.findElement(login).click();
    }



}
