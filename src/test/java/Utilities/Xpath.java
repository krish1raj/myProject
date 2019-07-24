package Utilities;

import org.openqa.selenium.By;

public class Xpath {

    public interface  LoginPage{
    public static By signIn=By.xpath("//span[contains (text(),'Hello, Sign in')]");
    public static By email=By.xpath("//*[@id='ap_email']");
    public static By login=By.xpath("//*[@id='ap_email']");
    }
    public interface  HomePage{
        public static By userName=By.xpath("//span[contains (text(),'Hello, Sign in')]");
        public static By cart=By.xpath("//*[@id='ap_email']");
    }
}
