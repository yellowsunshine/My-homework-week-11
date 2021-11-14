/*
Homework - 3
Open url : http://automationpractice.com/index.php
Click on Sign In
Enter correct Email in Email field
Enter wrong Password in Password field
Click on the Sign In button.
Expected Result:
Error Message “There is 1 error”

 */

package testsuite;

import browsertestinghw.BaseTestHW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoPracticeSignIn extends BaseTestHW {
    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp() {
        //Navigate to website
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldBeAbleToSignInSuccessfully() {
        //clicking on Sign in
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        //Entering the email
        driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
        //Entering the password
        driver.findElement(By.id("passwd")).sendKeys("12^&_l");
        //clicking on the sign in button
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")).click();
        //Verifying the error message
        String expectedErrorMessage = "There is 1 error";
        WebElement message = driver.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        String actualErrorMessage = message.getText();
        Assert.assertEquals("Error Message is not Displayed Correctly", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
