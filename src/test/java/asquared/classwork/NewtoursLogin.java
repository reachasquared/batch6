package asquared.classwork;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NewtoursLogin {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        //driver = AsquaredWebDriverFactory.getDriver();
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void newtoursLogin() {
        // Go to newtours website
        driver.get(baseUrl);

        //verify page title is "Welcome: Mercury Tours"
        assertEquals("Welcome: Mercury Tours",
                driver.getTitle());

        //Enter user name 'asquared'
        driver.findElement(By.name("userName"))
                .sendKeys("asquared");
        //Enter password 'asquared'
        driver.findElement(By.name("password"))
                .sendKeys("asquared");
        //Click on  Sign-In
        driver.findElement(By.name("login")).click();
        //verify Sign-off link exists
        assertTrue(driver.findElement(By.linkText("SIGN-OFF"))
                .isDisplayed());

        //click SIGN-OFF
        driver.findElement(By.linkText("SIGN-OFF")).click();
    }//method ends

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}//class ends
