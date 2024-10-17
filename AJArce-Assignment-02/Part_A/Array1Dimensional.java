/*
 * This is an example to demonstrate what is learned during the lectures. 
 * Please pay attention to the package name as some programs may require multiple files. 
 * If you need help, please reach out.
 */

/**
 *
 * @author TEAM CSC 210
 */
public class Array1Dimensional {

    public static void main(String[] args) {

        final int NUMMONTHS = 12;
        int[] newGrowth;
        newGrowth = new int[NUMMONTHS];

        System.out.println("Array's length: " + newGrowth.length);

        System.out.println("\nAverage Temperatures: ");
        int[] avgTemp = { 46, 48, 49, 50, 55, 56 };
        for (int i = 0; i < avgTemp.length; i++) {
            System.out.println(avgTemp[i]);
        }

        System.out.println("\nAverage Rain: ");
        int[] avgRain = { 5, 3, 3, 1, 1, 0, 0 };
        for (int i = 0; i < avgRain.length; i++) {
            System.out.println(avgRain[i]);
        }
    }
}
/*®
 * OUTPUT
 * Array's length: 12
 * 
 * Average Temperatures:
 * 46
 * 48
 * 49
 * 50
 * 55
 * 56
 * 
 * Average Rain:
 * 5
 * 3
 * 3
 * 1
 * 1
 * 0
 * 0
 */