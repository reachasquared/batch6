package asquared.classwork;

import org.junit.Test;

/**
 * Variables allow the Java program to store values during the runtime of the program.
 * In this class we can learn the Types and use of them
 */
public class ScopedVariables {
    //Variable declaration
    // character variable that can hold one character data
    char gender;
    // Integer variable that can hold an integer value
    int age;
    // String variable that can hold one string data
    String weekDay;

    //Variables can be declared and initiated at the same time like below
    //String array
    String weekDays[] = new String[]{"Sunday",
            "Monday", "Tuesday"};
    // Boolean variable can hold ONLY either true or false (no other data it accepts)
    boolean status = true;

    @Test
    public void variableExamples() {
        //Variable initiation
        gender = 'm';
        age = 30;
        weekDay = "Sunday";

        //Display values
        /*System.out.println(gender);
        System.out.println(age);
        System.out.println(weekDay);
        System.out.println(status);
        System.out.println(weekDays[1]);
*/
        displayValues();
        //To be more information here we are displaying a label for each value.
        //We need to use + while concatenating two values
        System.out.println("\n");//new lines
        System.out.println("Values with labels:");
/*
        System.out.println("Gender: " + gender);//we are displaying label 'Gender' and value
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);
        System.out.println("2nd value from Weekdays array:" + weekDays[1]);
*/
        displayValues();

        //Business logic that modifies values of Variables
        gender = 'f';
        age = 16;
        age = age - 1;
        weekDay = "Monday";
        status = false;
        weekDays[1] = "Saturday";

        //Display values
        System.out.println("\n");//new lines
        System.out.println("Values after business logic:");
        /*System.out.println("Gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);
        System.out.println("2nd value from Weekdays array:" + weekDays[1]);
        */
        displayValues();
    }// method ends


    /**
     * This method is to display values of variables
     */
    public void displayValues(){//displayValues method begins
        System.out.println("Gender: " + gender);//we are displaying label 'Gender' and value
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);
        System.out.println("2nd value from Weekdays array:" + weekDays[1]);
    }//displayValues method ends
}//class ends
