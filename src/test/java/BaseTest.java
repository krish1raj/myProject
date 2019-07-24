import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BaseTest {
    @Test
    public static void myTest( ) throws InterruptedException, ClassNotFoundException, SQLException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
        //Opening the browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//span[contains (text(),'Hello, Sign in')]")).click();
        String input= "sujithha30@gmail.com";
        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("sujithha30@gmail.com");
        driver.findElement(By.xpath("//*[@id='continue-announce']/..")).click();
        String email=driver.findElement(By.xpath("//*[@id='ap_email']")).getAttribute("value");
        Assert.assertEquals(input,email);
        driver.findElement(By.id("ap_password")).sendKeys("Prime@suji");
        driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
        String userNameTxt=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[@class='nav-line-1']")).getText();
        Assert.assertEquals(userNameTxt,"Hello, Sujeeth");
        WebElement element= driver.findElement(By.xpath("//*[@id='nav-cart']"));
        //Interacting with elements using action class
        Actions actions=new Actions(driver) ;
        actions.moveToElement(element).click();
        actions.moveToElement(driver.findElement(By.xpath("//span[ contains (text(),'Account & Lists')]/span"))).build().perform();
        Thread.sleep(5000);
        actions.moveToElement(driver.findElement(By.xpath("//span[ contains (text(),'Account & Lists')]/span"))).contextClick();

            //Select class
            WebElement dropdown= driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
            Select option=new Select(dropdown);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            option.selectByIndex(0);
            option.selectByVisibleText("Amazon Pantry");
            option.selectByValue("search-alias=amazon-devices");
            List<WebElement> allOptions= option.getOptions();
            for(WebElement elet:allOptions){
                    System.out.println(elet.getText());
                    option.selectByVisibleText(elet.getText());
            }
            System.out.println(option.getFirstSelectedOption().getText());
            Thread.sleep(3000);
            driver.close();
            WebDriverWait wait=new WebDriverWait(driver,10);
            WebElement element3=wait.until(ExpectedConditions.elementToBeClickable(dropdown));
            element3.click();
            FluentWait wait1 = new FluentWait(driver) .withTimeout(30, TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS) .ignoring(NoSuchElementException.class);
          //  WebElement foo = wait.until(new Function() { public WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo")); } });
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("url","","");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("abc");
        List<Integer> categories=new ArrayList<Integer>();
        while(resultSet.next()){
            int category=resultSet.getInt("category");
            categories.add(category);
        }

        String serverIp = "166.78.10.41";
        String keyspace = "gamma";
       // CassandraConnection connection;

        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIp)
                .build();

        Session session = cluster.connect(keyspace);


        String cqlStatement = "SELECT * FROM TestCF";
        com.datastax.driver.core.ResultSet resultSet1=session.execute("query");
        List<Row> rows=resultSet1.all();
        List<String> names= new ArrayList<String>();
        List<Integer> cateoryUi=new ArrayList<Integer>();
        List<Integer> cateoryDatabase=new ArrayList<Integer>();

        for(Row row:rows){
           int cateory= row.getInt("category");
           //Assert.assertTrue(cateoryUi.contains(cateory));
           cateoryDatabase.add(cateory);
        }
        Assert.assertEquals(cateoryUi,cateoryDatabase);


    }
    WebDriver driver=new ChromeDriver();
    public void waitForElementToBeClickable(WebElement element){
            WebDriverWait wait=new WebDriverWait(driver,10);
            WebElement element3=wait.until(ExpectedConditions.elementToBeClickable(element));
            element3.click();
    }
    public void clickOnLogin(){
            waitForElementToBeClickable(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));

    }


        }



