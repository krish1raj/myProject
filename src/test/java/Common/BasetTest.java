package Common;

import Utilities.Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BasetTest implements Xpath.LoginPage, Xpath.HomePage {
public static WebDriver driver=null;

@BeforeMethod
public static void openBrowser(){
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://4cwebappdev.azurewebsites.net/jacob/url/webapptest.html");

}

@AfterMethod
    public static void closeBrowser(){
    takeScreenShot();
    driver.quit();
    }

    public static void takeScreenShot(){
    }

}
