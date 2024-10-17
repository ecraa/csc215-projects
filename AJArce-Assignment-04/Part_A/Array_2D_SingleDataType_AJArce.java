/*

File: Array_2D_SingleDataType_AJArce.java
By: AJ Arce
Date: October 7th, 2024

Description: This program, defines two types of arrays: a regular array and an irregular array.
             The user doesn't provide any input and when run, it displays the contents to both
             arrays to the console, formatting them in a certain way with spaces to show the
             structure of each. The output includes the whole alphabet arranged according to the
             defined arrays.

 */
public class Array_2D_SingleDataType_AJArce {

    char[][] normalArray = {
            {'A', 'B', 'C', 'D', 'E', 'F', 'G', ' '},
            {' ', ' ', ' ', 'H', 'I', 'J', 'K', ' '},
            {' ', ' ', 'L', 'M', 'N', 'O', 'P', ' '},
            {' ', ' ', ' ', ' ', 'Q', 'R', 'S', ' '},
            {' ', ' ', ' ', ' ', 'T', 'U', 'V', ' '},
            {' ', ' ', ' ', ' ', ' ', 'W', 'X', ' '},
            {' ', ' ', ' ', ' ', ' ', 'Y', 'Z', ' '},
    };

    char[][] irregularArray = new char[7][];
    public Array_2D_SingleDataType_AJArce() {
        irregularArray[0] = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        irregularArray[1] = new char[]{'H', 'I', 'J', 'K'};
        irregularArray[2] = new char[]{'L', 'M', 'N', 'O', 'P'};
        irregularArray[3] = new char[]{'Q', 'R', 'S'};
        irregularArray[4] = new char[]{'T', 'U', 'V'};
        irregularArray[5] = new char[]{'W', 'X'};
        irregularArray[6] = new char[]{'Y', 'Z'};
    }

    public static void printAlphabet(char[][] normalArray, char[][] irregularArray) {
        System.out.println("Displaying contents in any 2D arrays:");
        for (int i = 0; i < normalArray.length; i++) {
            for (int j = 0; j < normalArray[i].length - 1; j++) {
                System.out.print(normalArray[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nDisplaying contents in irregularArray:");

        int maxArrayLength = irregularArray[0].length;
        for (int i = 0; i < irregularArray.length; i++) {
            int spacesToPrint = maxArrayLength - irregularArray[i].length;

            for (int s = 0; s < spacesToPrint; s++) {
                System.out.print("    ");
            }

            for (int j =  0; j < irregularArray[i].length; j++) {
                System.out.print(irregularArray[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Array_2D_SingleDataType_AJArce instance = new Array_2D_SingleDataType_AJArce();
        printAlphabet(instance.normalArray, instance.irregularArray);
    }
}

