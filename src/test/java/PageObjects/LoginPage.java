package PageObjects;


import Common.BasetTest;

public class LoginPage extends BasetTest {

    public static void clickOnLogin(){
        driver.findElement(login).click();

    }
    public static void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public static void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }



}
