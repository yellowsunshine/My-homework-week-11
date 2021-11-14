package xpathhomework;

import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LetsKodeIt extends BaseTestHW {
    String baseUrl = "https://learn.letskodeit.com/p/practice";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void method3() {

        //1 Using text method - Locating and Clicking on the redirection link
        driver.findElement(By.xpath("//a[text()='https://courses.letskodeit.com/practice']")).click();
        //2 Using Text method - Locating the Sign In link and clicking it
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();

        //3 Using AND with relative xpath - locating email field and entering email
        driver.findElement(By.xpath("//input[@class='form-control input-md' and @placeholder='Email Address']")).sendKeys("abc@gmail.com");

        //4 Basic relative xpath - For locating password tab and entering password
        driver.findElement(By.xpath("//div[@class='form-group']//input[@type='password']")).sendKeys("Kinjal123");

        //5 Using OR - locating the Login button and clicking on it
        driver.findElement(By.xpath("//input[@class='btn btn-default btn-block btn-md dynamic-button' or @value='Login']")).click();
        driver.navigate().back();

        //6 Using Text method - Locating the cookie policy link and clicking it
        driver.findElement(By.xpath("//a[text()='Cookie Policy']")).click();

        //7 Using Starts-With Function - Locating support tab and clicking it
        driver.findElement(By.xpath("//a[@target='_self' and text()='Support']")).click();

        //8 Using Absolute Xpath - Locating Your Name and entering the name
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[1]/div[1]/div/input")).sendKeys("Kinjal");

        //9 Using Basic Xpath with And - Locating the search button and Clicking it
        driver.findElement(By.xpath("//input[@class='form-control input-md' and @placeholder='Your Email *']")).sendKeys("Kinjal@gmail.com");

        //Using Contains() - Locating Submit button and clicking on it
        driver.findElement(By.xpath("//input[contains(@class,'btn btn-default btn-block btn-md dynamic-button')]")).click();

    }

    @After
    public void finish() {
        closeBrowser();
    }
}
