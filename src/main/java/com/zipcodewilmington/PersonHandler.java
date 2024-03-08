package com.zipcodewilmington;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        String result = "";
        String representation;
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            //begin loop
            // use `counter` to identify the `current Person` in the array
            for (counter = 0; counter < personArray.length; counter++) {
                representation = String.valueOf(personArray[counter]);
                result += representation;
            }
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
        }
        // end loop
        return result;
    }


    public String forLoop() {
        String result = "";
        String representation;

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int counter = 0; counter < personArray.length; counter++) {
                representation = String.valueOf(personArray[counter]);
                result += representation;
            }
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop

            return result;
        }
        public String forEachLoop() {
            String eachResult = "";
            String eachRepresentation;
            // identify array's type
            // identify array's variable-name
            for (Person each : personArray) {

                eachRepresentation = String.valueOf(each);
                eachResult += eachRepresentation;
            }
                // use the above discoveries to declare for-each-loop signature
                // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                // end loop

            return eachResult;
        }

        public Person[] getPersonArray () {
            return personArray;
        }
    }