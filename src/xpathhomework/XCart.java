package xpathhomework;

import browsertestinghw.BaseTestHW;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class XCart extends BaseTestHW {

    String baseUrl = "https://demostore.x-cart.com/shipping";

    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }

    @Test
    public void method5(){

        //Chained Xpath to locate and click on coming soon link
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//*[@href='coming-soon/']")).click();

        //1. Basic relative xpath - For locating logo and ensuring its clickable
       driver.findElement(By.xpath("//img[@alt='Home' and @data-max-width='221']")).click();

        //2. Using relative xpath - locating currency field and ensuring its clickable
        driver.findElement(By.xpath("//span[@class='currency-indicator']")).click();

        //3. Using OR - locating the Beauty and Health section and clicking on it
        driver.findElement(By.xpath("//img[@alt ='Beauty & Health' and @class=' lazyloaded']")).click();

        //4. Using Contains() - Locating Cosmetics and ensuring its clickable
        driver.findElement(By.xpath("//img[contains(@alt,'Cosmetics')]")).click();

        //5. Using Starts-With Function - Locating ID and entering the ID
        driver.findElement(By.xpath("//img[starts-with(@alt,'Red')]")).click();
        driver.navigate().back();

        //6. Using text method - Clicking on square glasses
        driver.findElement(By.xpath("//a[text()='Square Glasses in Black with Clear Lens']")).click();


        //7. Using Basic Xpath with And - Locating the search button and entering sunglasses
        driver.findElement(By.xpath("//input[@name='substring' and @placeholder='Search items...']")).sendKeys("sunglasses");

        //8. Using Xpath Starts with - Locating the search button and clicking
        driver.findElement(By.xpath("//button[starts-with(@class,'btn  regular-button submit')]")).click();

        //Locating the home Link and clicking on it
        driver.findElement(By.xpath("//img[@alt='Home' and @data-max-width='221']")).click();

        //Locating the Electronics link and clicking on it
        driver.findElement(By.xpath("//span[@class='language-indicator']")).click();;
    }

    @After
    public void finish(){
        closeBrowser();
    }
}
