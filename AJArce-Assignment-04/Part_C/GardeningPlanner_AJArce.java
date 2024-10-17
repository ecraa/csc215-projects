/*

File: GardeningPlanner_AJArce.java
By: AJ Arce
Date: October 10th, 2024

Description: This program allows the user to input average temperature and rainfall values
             of each month of the year. Using these inputs, it calculates the expected growth
             of the plant. The user provides min and max temperature as well as the min rainfall
             value. The results are displayed to include the estimated plant growth and height for
             each month based on the given data.

 */
import java.util.Arrays;
import java.util.Scanner;
public class GardeningPlanner_AJArce {
    static Scanner input = new Scanner(System.in);

    static int[] avgTemp = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
    static int[] avgRain = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};
    static int[] indexOfGrowth = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    static String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] welcomeAndInputs(){
        String border = "------------------------------------------------------------------------------------------";
        System.out.println(border);
        System.out.println("Welcome to the CSC 215 Gardening Planner!");
        System.out.println(border);

        System.out.print("- Enter minimum temperature for plant: ");
        var minTemp = input.nextInt();
        System.out.print("- Enter maximum temperature for plant: ");
        var maxTemp = input.nextInt();
        System.out.print("- Enter minimum rainfall for plant: ");
        var minRain = input.nextInt();
        System.out.printf(border);
        System.out.println();
        System.out.println();

        return new int[]{minTemp, maxTemp, minRain};
    }
    public static int[] plantGrowthCalc(int[] minMaxValues) {
        int minTemp = minMaxValues[0];
        int maxTemp = minMaxValues[1];
        int minRain = minMaxValues[2];
        int[] plantGrowth = new int[12];

        for (int i = 0; i < indexOfGrowth.length; i++) {
            if (avgTemp[i] < minTemp || avgTemp[i] > maxTemp) {
                plantGrowth[i] = -1;
            }
            else {
                plantGrowth[i] = avgRain[i] - minRain;
            }
        }
        return plantGrowth;
    }

    public static int[] plantHeight(int[] plantGrowth) {
        int[] plantHeight = new int[12];
        plantHeight[0] = Math.max(0, plantGrowth[0]);
        for (int i = 1; i < plantGrowth.length;i++) {
            plantHeight[i] = plantHeight[i - 1] + plantGrowth[i];
            if (plantHeight[i] <= 0) {
                plantHeight[i] = 0;
            }
            }
        return plantHeight;
    }

    public static String applyYellowBackground(String text) {
        final String YELLOW_BACKGROUND = "\u001B[43m";
        final String BLACK_TEXT = "\u001B[30m";
        final String RESET = "\u001B[0m";
        return YELLOW_BACKGROUND + BLACK_TEXT + text + RESET;
    }
    public static void printTable(int[] plantGrowth, int[] plantHeight){
        String border = "-------------- -------------- -------------- -------------- -------------- ---------------";
        System.out.println(border);
        String[] tableLabels = new String[] {"INDEX", "MONTH", "TEMPERATURE", "RAINFALL", "PLANT GROWTH", "PLANT HEIGHT"};
        System.out.printf("%-14s %-14s %-14s %-14s %-14s %-14s\n",
                          tableLabels[0], tableLabels[1], tableLabels[2], tableLabels[3], tableLabels[4], tableLabels[5]);
        int maxPlantHeight = Arrays.stream(plantHeight).max().orElse(0);
        for (int i = 0; i < indexOfGrowth.length; i++) {
            String plantGrowthValue = (plantGrowth[i] >= 0) ? "+" + plantGrowth[i]:String.valueOf(plantGrowth[i]);
            String plantHeightValue = (plantHeight[i] == maxPlantHeight) ? plantHeight[i] + "    " + applyYellowBackground("MAX") : String.valueOf(plantHeight[i]);
            System.out.printf("%-14d %-14s %-14d %-14d %-14s %-14s", indexOfGrowth[i], month[i], avgTemp[i], avgRain[i], plantGrowthValue, plantHeightValue );
            System.out.println();
        }
        System.out.println(border);

    }

    public static void runProgram() {
        int[] plantGrowthCalc = plantGrowthCalc(welcomeAndInputs());
        int[] plantHeight = plantHeight(plantGrowthCalc);
        printTable(plantGrowthCalc, plantHeight);
    }

    public static void main(String[] args) {
        runProgram();
    }

}






