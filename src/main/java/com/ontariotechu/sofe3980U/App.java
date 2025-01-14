package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Main application entry point.
 *
 */
public class App 
{
    /**
    * Main program: The entry point of the program. The local time will be printed first,
    *      Then it will allow the user to input two binary variables,
    *      perform operations (add, or, and, multiply) on them, and display the results.
    *
    * @param args: not used
    */
    public static void main(String[] args) 
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);
        System.out.println("First binary number (processed): " + binary1.getValue());

        System.out.println("Enter the second binary number:");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);
        System.out.println("Second binary number (processed): " + binary2.getValue());

        // Perform addition
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Sum (binary1 + binary2): " + sum.getValue());

        // Perform bitwise OR
        Binary orResult = Binary.or(binary1, binary2);
        System.out.println("OR (binary1 | binary2): " + orResult.getValue());

        // Perform bitwise AND
        Binary andResult = Binary.and(binary1, binary2);
        System.out.println("AND (binary1 & binary2): " + andResult.getValue());

        // Perform multiplication
        Binary multiplyResult = Binary.multiply(binary1, binary2);
        System.out.println("Multiply (binary1 * binary2): " + multiplyResult.getValue());

        scanner.close();
    }
}
