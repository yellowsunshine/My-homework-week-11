package xpathhomework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import browsertestinghw.BaseTestHW;

public class AutomationPractice extends BaseTestHW {
    String baseUrl = "http://automationpractice.com/index.php?id_category=8&controller=category";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void method2() {

        //Basic relative xpath - For locating searchbox and entering information
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dresses");

        //Using AND with relative xpath - locating search button and clicking it
        driver.findElement(By.xpath("//button[@type='submit' and @name='submit_search']")).click();

        //Using text method and the And Method - Locating and Clicking on the text TOP SELLERS
        driver.findElement(By.xpath("//a[(text()='Top sellers') and @title = 'View a top sellers products']")).click();

        //Using Starts-With Function - Locating List Icon and clicking on it
        driver.findElement(By.xpath("//i[starts-with(@class,'icon-th-list')]")).click();

        //Using AND - locating the Image of the Black Blouse and clicking on it
        driver.findElement(By.xpath("//img[@title='Blouse' and @itemprop='image']")).click();
        driver.navigate().back();

        //Using Contains() - Locating the tab WOMEN and clicking on the link
        driver.findElement(By.xpath("//a[contains(@class,'sf-with-ul') and @title='Women']")).click();

        //Using AND - Locating Woman Image and clicking
        driver.findElement(By.xpath("//img[@class='replace-2x' and @src='http://automationpractice.com/img/c/4-medium_default.jpg']")).click();

        //Using Basic Xpath - Locating the delivery link and Clicking it
        driver.findElement(By.xpath("//a[@title='Delivery']")).click();

        //Using Starts-with for Locating the logo and clicking on it to return to homepage
        driver.findElement(By.xpath("//img[starts-with(@class,'logo img')]")).click();

        //Using Contains() and the AND method along with TEXT() - Locating the tab Selenium Framework and clicking on the link
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-default') and (text()='Selenium Framework')]")).click();
    }

    @After
    public void finish() {
        closeBrowser();
    }
}
