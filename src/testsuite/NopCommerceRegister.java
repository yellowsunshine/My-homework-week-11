/*
Homework – 2
Navigate to website "https://demo.nopcommerce.com/"
Click on the register link.
Fill in all the fields.
Click on the register button.
Verify that the user registered successfully.
 */

package testsuite;
import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class NopCommerceRegister extends BaseTestHW {

    String baseUrl="https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        //Navigate to website
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        //Click on the register link.
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //Click on radio button for female
        driver.findElement(By.cssSelector("#gender-female")).click();
        //Enter value in the First Name field
        driver.findElement(By.cssSelector("#FirstName")).sendKeys("John");
        //Enter value in the Last Name field
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Smith");
        //Enter the date of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("1");
        //Entering the month of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        //Entering the year of birth
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2000");
        //Generating Random Email
        driver.findElement(By.cssSelector("#Email")).sendKeys(getEmailString()+"@gmail.com");
        //Entering Company information
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Prime");
        //Entering Password and Confirm Password
        driver.findElement(By.id("Password")).sendKeys("John12345");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("John12345");
        //Clicking the register button
        driver.findElement(By.cssSelector("#register-button")).click();
        //Verifying if I am registered successfully
        String expectedMessage = "Your registration completed";
        WebElement message= driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage=message.getText();
        Assert.assertEquals("user is not registered successfully",expectedMessage,actualMessage);


    }
        //RandomEmail Generation Method
        public String getEmailString(){
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail= new Random();
        while (email.length()<10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = email.toString();
        return saltStr;
        }



    @After
    public void tearDown() {
        closeBrowser();
    }


}
