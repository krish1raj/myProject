import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestNg {

    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("before suite");

    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");

    }
    @BeforeMethod
    public static void beforeMethods() {
        System.out.println("before method");
    }
    @Test
    public static void myTest1() {
        System.out.println("Test1");
    }

    @Test
    public static void myTest2() {
        System.out.println("Test2");
    }
    @BeforeMethod
    public static void AfterMethods() {
        System.out.println("After method");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("After class");

    }
    @AfterSuite
    public static void afterSuite() {
        System.out.println("After suite");
    }

}



