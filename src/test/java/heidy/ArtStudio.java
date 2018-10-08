package heidy;
import org.junit.Test;

public class ArtStudio {
    @Test
    public void  mainhall(){
        System.out.println("I see a white board in the hall");
        System.out.println(" I see a table in the hall");
        reception();
        bathroom();
    }

    public void reception() {
        System.out.println("I see a desk in the receptcion");

        System.out.println("I see supplies in store room");
    }

    public void bathroom(){
        System.out.println("I see a trash can in the bathroom");

    }
    public void storeRoom(){
        System.out.println(" I see supplies");
    }

}//class end

