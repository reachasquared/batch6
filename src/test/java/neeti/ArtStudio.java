package neeti;

import org.junit.Test;

public class ArtStudio {
    /**
     * method to print the objects located in an art studio.
     */

    @Test
    /** make the methods differently.. which is know as modular.
     * it creates the different compartments which is easy for us the
     * edit to maintain the java class
     */
    public void mainhall() {
        System.out.println("I am in the Art studio");
        System.out.println("I can see the board in the Studio");
        reception();
        bathroom();
    }

    public void reception() {
        System.out.println("I can see the table in the Hall");
    }
/* we can write the modular like the storeroom style too

 */

    public void bathroom() {
        System.out.println("I can see trash can in the bathroom");
        storeroom();
    }

    public void storeroom() {
        System.out.println("I can see the supplies in the Storage");

    }

}






