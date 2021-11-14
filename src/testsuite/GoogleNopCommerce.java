/*
Homework -1
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
 */


package testsuite;

import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class GoogleNopCommerce extends BaseTestHW {

    String baseUrl = "https://www.google.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldLoginToComputersPageSuccessfully(){

        //Agreeing the terms and conditions
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        //In Google search type "demo nopCommerce store"
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        //Clicking Enter on the searchbox on google
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        //Click on the link "nopCommerce demo store"
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        //Click on Computers and Verify that the user successfully navigated to the Computers page.
        driver.findElement(By.linkText("Computers")).click();//locating the element and click
        String expectedMessage = "Computers";//Saving expected message as a String
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = message.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage,actualMessage);//Verifying using the asset method

    }

    @Test
    public void verifyUserShouldLoginToElectronicsPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Electronics")).click();//locating the element and click
        String expectedMessage2 = "Electronics";//Saving expected message as a String
        WebElement message2 = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage2 = message2.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage2,actualMessage2);//Verifying using the asset method
    }

    @Test
    public void verifyUserShouldLoginToApparelsPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Apparel")).click();//locating the element and click
        String expectedMessage3 = "Apparel";//Saving expected message as a String
        WebElement message3 = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage3 = message3.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage3,actualMessage3);//Verifying using the asset method

    }



    @Test
    public void verifyUserShouldLoginToDigitalDownloadsPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Digital downloads")).click();//locating the element and click
        String expectedMessage4 = "Digital downloads";//Saving expected message as a String
        WebElement message4 = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage4 = message4.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage4,actualMessage4);//Verifying using the asset method

    }

   @Test
    public void verifyUserShouldLoginToBooksPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Books")).click();//locating the element and click
        String expectedMessage5 = "Books";//Saving expected message as a String
        WebElement message5 = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage5 = message5.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage5,actualMessage5);//Verifying using the asset method

    }

    @Test
    public void verifyUserShouldLoginToJewelleryPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Jewelry")).click();//locating the element and click
        String expectedMessage6 = "Jewelry";//Saving expected message as a String
        WebElement message6 = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage6 = message6.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage6,actualMessage6);//Verifying using the asset method

    }

    @Test
    public void verifyUserShouldLoginToGiftCardsPageSuccessfully(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys("demo nopCommerce store");
        driver.findElement(By.xpath("//input[@class ='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div[1]/a/h3")).click();
        driver.findElement(By.linkText("Gift Cards")).click();//locating the element and click
        String expectedMessage7 = "Gift Cards";//Saving expected message as a String
        WebElement message7 = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage7 = message7.getText();//Converting WebElement into String
        Assert.assertEquals(expectedMessage7,actualMessage7);//Verifying using the asset method

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
