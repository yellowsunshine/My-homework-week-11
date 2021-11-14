package xpathhomework;

import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class NopCommerce extends BaseTestHW {
    String baseUrl = "https://demo.nopcommerce.com/gift-cards";

    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }

    @Test
    public void method4(){

        //1 Basic relative xpath - For locating login and click
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //2 Using relative xpath - locating logo and click
        driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();

        //3 Using OR - locating the Search button and typing rings in it
        driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='q']")).sendKeys("rings");

        //4 Using Contains() - Locating search button and clicking
        driver.findElement(By.xpath("//button[contains(@class,'button-1 search-box-button')]")).click();

        //5 Using Starts-With Function - Locating register and clicking the link
        driver.findElement(By.xpath("//a[starts-with(@class,'ico-register')]")).click();

        //6 Using Absolute Xpath - Locating radio button female and clicking
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")).click();

        //7 Using Basic Xpath with And - Locating the First Name field and entering the name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Lisa");

        //8 Using text method - Clicking on Electronics
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();

        //9 Locating the image from other category and clicking on it
        driver.findElement(By.xpath("//img[@alt='Picture for category Others' and @title='Show products in category Others']")).click();

        //10 Using text method - Clicking on the wireless speaker
        driver.findElement(By.xpath("//a[text()='Beats Pill 2.0 Wireless Speaker']")).click();
    }

    @After
    public void finish(){
        closeBrowser();
    }
}
