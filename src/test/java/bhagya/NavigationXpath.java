package bhagya;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class NavigationXpath extends global {

    @Test
    public void navigationXpath() {

//Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1: Go to http://newtours.demoaut.com");
        driver.get(baseUrl);

//Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours",
                driver.getTitle());

//Step 2	Click on SIGN-ON link in Header
        //driver.findElement(By.linkText("SIGN-ON"))
               // .click();

        driver.findElement(By.xpath("//a[@href='mercurysignon.php']")).click();

//Assert page title : Sign-on: Mercury Tours
        assertEquals("Sign-on: Mercury Tours",
                driver.getTitle());


//Step 3	Click on SUPPORT link in Header
        driver.findElement(By.xpath("//a[text()='SUPPORT']")).click();



//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());

//Step 4	Click on CONTACT link in Header
        driver.findElement(By.xpath("//a[text()='CONTACT']")).click();


//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());

//Step 5	Click on Home link in left side menu
        driver.findElement(By.xpath("//a[text()='Home']")).click();


//Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours",driver.getTitle());


//Step 6	Click on Flight link in left side menu
        driver.findElement(By.xpath("//a[text()='Flights']")).click();


//Assert page title : Welcome: Mercury Tours
        assertEquals("Welcome: Mercury Tours",driver.getTitle());

//Step 7	Click on Hotels link in left side menu
        driver.findElement(By.xpath("//a[text()='Hotels']")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());

//Step 8	Click on Car Rentals link in left side menu
        driver.findElement(By.xpath("//a[text()='Car Rentals']")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());

//Step 9	Click on Cruises link in left side menu
        driver.findElement(By.xpath("//a[text()='Cruises']")).click();


//Assert page title : Cruises: Mercury Tours
        assertEquals("Cruises: Mercury Tours",driver.getTitle());

//Step 10	Click on Destinations link in left side menu
        driver.findElement(By.xpath("//a[text()='Destinations']")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());

//Step 11	Click on Vacations link in left side menu
        driver.findElement(By.xpath("//a[text()='Vacations']")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());

    }//method ends
}// class ends


