/*

File: Array_2D_MultipleDataType_AJArce.java
By: AJ Arce
Date: October 8th, 2024

Description: This program prompts the user to input different types of data to fill a 2D array
             which includes integers, characters, and strings. Specifically, the user inputs 3
             ints, 3 chars, 3 strings, and then a combination of 1 int, 1 char, and 1 string.
             THe program then displays the array in two views: the data types of each data stored
             and the actual values entered.

 */

import java.util.Scanner;
public class Array_2D_MultipleDataTypes_AJArce {
    static Scanner input = new Scanner(System.in);
    public static void multiDataTypes() {
        System.out.print("Row 1 | Please enter 3 Integers:    ");
        int integer1 = input.nextInt();
        int integer2 = input.nextInt();
        int integer3 = input.nextInt();

        System.out.print("Row 2 | Please enter 3 Characters:  ");
        char char1 = input.next().charAt(0);
        char char2 = input.next().charAt(0);
        char char3 = input.next().charAt(0);

        System.out.print("Row 3 | Please enter 3 Strings:     ");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();

        System.out.print("Row 4 | 1, Int, 1 Char, 1 String:   ");
        int integer4 = input.nextInt();
        char char4 = input.next().charAt(0);
        String string4 = input.next();

        System.out.println();

        Object[][] inputDatabase = new Object[4][3];
        inputDatabase[0] = new Object[]{integer1, integer2, integer3};
        inputDatabase[1] = new Object[]{char1, char2, char3};
        inputDatabase[2] = new Object[]{string1, string2,string3};
        inputDatabase[3] = new Object[]{integer4, char4, string4};


        System.out.print("Your 2D array of multiple data types:");
        System.out.println();
        System.out.println();

        System.out.println("- Data Type View:");
        for (int i = 0; i < inputDatabase.length; i++) {
            for (int j = 0; j < inputDatabase[i].length; j++) {
                if (inputDatabase[i][j] instanceof Integer) {
                    System.out.printf("               %-16s", "Integer");
                } else if (inputDatabase[i][j] instanceof Character) {
                    System.out.printf("               %-16s", "Character");
                } else if (inputDatabase[i][j] instanceof String) {
                    System.out.printf("               %-16s", "String");
                }
            }
            System.out.println();
        }


        System.out.println();

        System.out.println("- Data Value View:");
        System.out.printf("               %-12d                   %-12d                   %-12d\n",(int)inputDatabase[0][0], (int)inputDatabase[0][1], (int)inputDatabase[0][2]);
        System.out.printf("               %-12c                   %-12c                   %-12c\n",(char)inputDatabase[1][0], (char)inputDatabase[1][1], (char)inputDatabase[1][2]);
        System.out.printf("               %-12s                   %-12s                   %-12s\n", inputDatabase[2][0], inputDatabase[2][1], inputDatabase[2][2]);
        System.out.printf("               %-12d                   %-12c                   %-12s\n", (int)inputDatabase[3][0],(char)inputDatabase[3][1],inputDatabase[3][2]);




    }

    public static void main(String[] args) {
        multiDataTypes();
    }
}
