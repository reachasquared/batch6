package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class recrodingVerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testRecrodingVerifyLinks() {
        // Go to http://newtours.demoaut.com/
        driver.get(baseUrl + "/");
        // Verify webpage loads
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        // Verify Home link exist
        assertEquals("Home", driver.findElement(By.linkText("Home")).getText());

        // Verify Flights link exist
        assertEquals("Flights", driver.findElement(By.linkText("Flights")).getText());

        // Verify Hotels link exist
        assertEquals("Hotels", driver.findElement(By.linkText("Hotels")).getText());

        //Verify Cars link exist
        assertEquals("Car Rentals", driver.findElement(By.linkText("Car Rentals")).getText());

        // Verify Cruises link exist
        assertEquals("Cruises", driver.findElement(By.linkText("Cruises")).getText());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
