package xpathhomework;

import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class OrangeHRMXPath extends BaseTestHW {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void method1(){

        //Basic relative xpath - For locating username and entering information
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

        //Using AND with relative xpath - locating Password field and entering password
        driver.findElement(By.xpath("//input[@id='txtPassword' and @type='password']")).sendKeys("admin123");

        //Using OR - locating the Login button and clicking on it
        driver.findElement(By.xpath("//input[@id='btnLogin' or @value=login]")).click();

        //Using Contains() - Locating Employee Name and entering the name
        driver.findElement(By.xpath("//input[contains(@id,'empsearch_employee_name_empName')]")).sendKeys("Lisa Andrews");

        //Using Starts-With Function - Locating ID and entering the ID
        driver.findElement(By.xpath("//input[starts-with(@id,'empsearch_id')]")).sendKeys("0208");

        //Using Absolute Xpath - Locating Supervisor Name and entering the name
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/form[1]/fieldset[1]/ol[1]/li[5]/input[1]")).sendKeys("John Smith");

        //Using Basic Xpath with And - Locating the search button and Clicking it
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

        //Using text method - Clicking on Welcome Andrei
        driver.findElement(By.xpath("//a[starts-with(@class,'panel')]")).click();

        //Locating the ? button and clicking on it
        driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/a[3]")).click();

        //Locating the Marketplace link and clicking on it using relative xpath
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[9]/input[1]")).click();
        }

    @After
    public void finish(){
        closeBrowser();
    }

}
