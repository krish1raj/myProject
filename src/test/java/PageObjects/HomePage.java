package PageObjects;

import Common.BasetTest;

public class HomePage extends BasetTest {
    public static void verifyUser(){
        driver.findElement(userName).click();
    }
}
