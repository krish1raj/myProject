package Utilities;

import org.openqa.selenium.By;

public class Xpath {

    public interface  LoginPage{
    public static By password=By.xpath("//input[@name='pass']");
    public static By userName=By.xpath("//input[@name='username']");
    public static By login=By.xpath("//button[contains(text(),'Login')]");
    }
    public interface  HomePage{
        public static By logout=By.xpath("//button[contains(text(),'Log Out')]");
     }
}
