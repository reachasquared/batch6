package asquared.classwork;

import core.engine.global;
import org.junit.Test;

public class NavigationXpath extends global {
    @Test
    public void navigationXpath() {

//Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1: Go to http://newtours.demoaut.com");
        driver.get(baseUrl);

//Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");

//Step 2	Click on SIGN-ON link in Header

//Assert page title : Sign-on: Mercury Tours

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
}//class end
