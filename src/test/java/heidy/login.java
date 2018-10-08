package heidy;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class login {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before // execute before than test
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    driver = AsquaredWebDriverFactory.getDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    // Go through each command in this script. Observe the value under Target column and try to understand the different ways used to locate an element in HTML
    driver.get("http://newtours.demoaut.com/");
    // Assert page title
    assertEquals("Welcome: Mercury Tours",
            driver.getTitle());
    // Enter asquared into user name field
    driver.findElement(By.name("userName")).sendKeys("asquared");
    // Enter asquared into user password field
    driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("asquared");
    // Click on Sign-in button
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
    // Verify user is successfully logged in
    assertEquals("Find a Flight: Mercury Tours:",
            driver.getTitle());
    assertTrue(isElementPresent(By.cssSelector("img[src=\"/images/masts/mast_flightfinder.gif\"]")));
    // verify Sign off link exists
    assertEquals("SIGN-OFF",
            driver.findElement(By.cssSelector("a:contains(\"SIGN-ON\")")).getText());
    // clikc on sign-off
    // ERROR: Caught exception [Error: Dom locators are not implemented yet!]
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
