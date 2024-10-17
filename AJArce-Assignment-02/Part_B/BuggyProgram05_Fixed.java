import java.util.Scanner;
/*
File: BuggyProgram05_Fixed.java
By: AJ Arce
Date: Septemeber 13th, 2024

Description: This program prompts the user to enter a starting number , a number to count up with, as well as a number to stop counting if reached/exceeded.
 */

class DebugProgram5 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // This program counts up by a certain amount until it reaches a specified number
        System.out.print("Starting Number: ");
        float startNum = input.nextFloat();

        System.out.print("Number to count up with: ");
        float numToAdd = input.nextFloat();  // Changed to float

        System.out.print("Number to stop counting at: ");
        float endNum = input.nextFloat();

        float currentNum = startNum;
        int i = 0;

        while (currentNum <= endNum) {
            System.out.printf("This run: %d | Original Number: %.2f | Current Number: %.2f \n", i, startNum, currentNum);
            currentNum += numToAdd;
            i++;
        }

        System.out.println("Finished counting down! Exiting...");




    /*
    ============================================
     Expected Output Samples:
    ============================================
     
    ----------------------------------
    Sample Output 1
    ----------------------------------
    Starting Number: 1.2
    Number to count up with: 1.1
    Number to stop counting at: 10
    This run: 0 | Original Number: 1.20 | Current Number: 1.20
    This run: 1 | Original Number: 2.30 | Current Number: 1.20
    This run: 2 | Original Number: 3.40 | Current Number: 1.20
    This run: 3 | Original Number: 4.50 | Current Number: 1.20
    This run: 4 | Original Number: 5.60 | Current Number: 1.20
    This run: 5 | Original Number: 6.70 | Current Number: 1.20
    This run: 6 | Original Number: 7.80 | Current Number: 1.20
    This run: 7 | Original Number: 8.90 | Current Number: 1.20
    This run: 8 | Original Number: 10.00 | Current Number: 1.20
    This run: 9 | Original Number: 11.10 | Current Number: 1.20
    Finished counting... Exiting

    ----------------------------------
    Sample Output 2
    ----------------------------------
    Starting Number: 10.5
    Number to count up with: 1.1
    Number to stop counting at: 1
    Finished counting down! Exiting...



    */

    }
}