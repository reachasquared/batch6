package asquared.classwork;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Navigation extends global {
    @Test
    public void navigation() {

//Step 1	Go to http://newtours.demoaut.com
        driver.get(baseUrl);

//Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours",
                driver.getTitle());

//Step 2	Click on SIGN-ON link in Header
        driver.findElement(By.linkText("SIGN-ON"))
                .click();

//Assert page title : Sign-on: Mercury Tours
        assertEquals("Sign-on: Mercury Tours",
                driver.getTitle());

//Step 3	Click on SUPPORT link in Header

//Assert page title : Under Construction: Mercury Tours

//Step 4	Click on CONTACT link in Header

//Assert page title : Under Construction: Mercury Tours

//Step 5	Click on Home link in left side menu

//Assert page title : Welcome: Mercury Tours

//Step 6	Click on Flight link in left side menu

//Assert page title : Welcome: Mercury Tours

//Step 7	Click on Hotels link in left side menu

//Assert page title : Under Construction: Mercury Tours

//Step 8	Click on Car Rentals link in left side menu

//Assert page title : Under Construction: Mercury Tours

//Step 9	Click on Cruises link in left side menu

//Assert page title : Cruises: Mercury Tours

//Step 10	Click on Destinations link in left side menu

//Assert page title : Under Construction: Mercury Tours

//Step 11	Click on Vacations link in left side menu

//Assert page title : Under Construction: Mercury Tours

    }//method ends
}// class ends
