/*

File: BMI_CSC215_English_AJArce.java
By: A.J Arce
Date: September 26th, 2024

Description: This is the English version of the BMI program, which uses height/inches and centimeters for weight and height respectively.
             The program will take in a users height and weight, calculate their bmi, and print a table with a range of weights/bmis
             including the users.
*/

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BMI_CSC215_English_AJArce {
    Scanner input = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

    public void welcomeMessage() {
        String border = "---------------------------------------------------------------------------------------------";
        System.out.println(border);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) Computation, CSC 215, English version");
        System.out.println("--                                                                   by AJ Arce");
        System.out.println(border);
    }
    public String[] getUserInfo() {
        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Please enter your height in feet and inches for " + fullName + ": ");
        int heightFeet = input.nextInt();
        int heightInches = input.nextInt();

        System.out.print("Please enter weight in pounds for " + fullName + ": ");
        double weight = input.nextDouble();

        return new String[] {fullName, String.valueOf(heightFeet), String.valueOf(heightInches), String.valueOf(weight)};
    }

    public double calculateBMI (int heightFeet, int heightInches, double weight) {
        int totalHeightInInches = (heightFeet * 12) + heightInches;
        return (weight / (totalHeightInInches * totalHeightInInches)) * 703;
    }

    public String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Healthy Weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public void displaySummary(String fullName, double bmi, String weightStatus) {
        double roundedBMI = Math.round(bmi * 10.0) / 10.0;
        System.out.println("-- SUMMARY REPORT for " + fullName.toUpperCase());
        System.out.println("-- Date and Time:     " + formattedDateTime);
        System.out.printf("-- BMI:               %.6f (or %.1f if rounded) \n", bmi, roundedBMI);
        System.out.println("-- Weight Status:     " + weightStatus);
    }

    public double[] lowAndHighWeight(String fullName) {
        System.out.printf("Please enter a LOW weight in pounds for " + fullName + ": ");
        double lowWeight = input.nextDouble();
        System.out.printf("Please enter a HIGH weight in pounds for " + fullName + ": ");
        double highWeight = input.nextDouble();
        return new double[] {lowWeight,highWeight};
    }

    public String applyYellowBackground(String text) {
        final String YELLOW_BACKGROUND = "\u001B[43m";
        final String BLACK_TEXT = "\u001B[30m";
        final String RESET = "\u001B[0m";
        return YELLOW_BACKGROUND + BLACK_TEXT + text + RESET;
    }

    public String getDecimalFormatByStatus(String weightStatus) {
        switch (weightStatus) {
            case "Underweight":
                return "%-10.2f";
            case "Healthy Weight":
                return "%-10.3f";
            case "Overweight":
                return "%-10.4f";
            case "Obesity":
                return "%-10.5f";
            default:
                return "%10.2f";
        }
    }

    public void displayBMITable(String fullName, int heightFeet, int heightInches, double userWeight) {
        double[] weights = lowAndHighWeight(fullName);
        double lowWeight = weights[0];
        double highWeight = weights[1];
        double tableWeight = lowWeight;
        boolean isFirstRow = true;
        boolean userWeightPrinted = false;

        System.out.println("--------------------------------------------------------------");
        System.out.println("|  WEIGHT (lbs) |     BMI     |  WEIGHT STATUS               |");
        System.out.println("--------------------------------------------------------------");

        while (tableWeight < highWeight) {
            double bmi = calculateBMI(heightFeet, heightInches, tableWeight);
            String weightStatus = getWeightStatus(bmi);
            String formatString = getDecimalFormatByStatus(weightStatus);

            if (!userWeightPrinted && tableWeight >= userWeight) {
                double userBMI = calculateBMI(heightFeet, heightInches, userWeight);
                String userWeightStatus = getWeightStatus(userBMI);
                String userFormatString = getDecimalFormatByStatus(userWeightStatus);
                System.out.printf("|  %-12.2f |  " + userFormatString + " |  %-18s%-5s    |\n", userWeight, userBMI, userWeightStatus, "(this)");
                userWeightPrinted = true;
            }

            if (isFirstRow) {
                System.out.printf("|  %-12.2f |  " + formatString + " |  %-18s%-5s     |\n", tableWeight, bmi, weightStatus, applyYellowBackground("(LOW)"));
                isFirstRow = false;
            } else {
                System.out.printf("|  %-12.2f |  " + formatString + " |  %-18s          |\n", tableWeight, bmi, weightStatus);
            }

            tableWeight += 2.5;
        }

        double highWeightBMI = calculateBMI(heightFeet, heightInches, highWeight);
        String highWeightStatus = getWeightStatus(highWeightBMI);
        String highWeightFormatString = getDecimalFormatByStatus(highWeightStatus);

        if (!userWeightPrinted && highWeight == userWeight) {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", userWeight, highWeightBMI, highWeightStatus, "(this)");
        } else {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", userWeight, highWeightBMI, highWeightStatus, applyYellowBackground("(HIGH)"));
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println();
        System.out.println("The SFSU Mashouf Wellness Center is at 755 Font Blvd.");
    }

    public void displayEndingMessage(String fullName) {
        String message;
        String lowerCaseName = fullName.toLowerCase();
        if (lowerCaseName.equals("otto minion")) {
            message = "Poopaye!!!";
        } else if (lowerCaseName.equals("minnie mouse")) {
            message = "Ear-esistable!!!";
        } else if (lowerCaseName.equals("baymax hamada")) {
            message = "Sayōnara!!!";
        } else if (lowerCaseName.equals("goofy dog")) {
            message = "Woof Woof!!!";
        } else {
            message = "Have a great day!";
        }
        String border = "---------------------------------------------------------------------------------------------";
        System.out.println(border);
        System.out.println("-- Thank you for using my program, " + fullName + "!");
        System.out.println("-- " + message);
        System.out.println(border);
    }

    public void runProgram() {
        welcomeMessage();
        String[] userInfo = getUserInfo();
        String fullName = userInfo[0];
        int heightFeet = Integer.parseInt(userInfo[1]);
        int heightInches = Integer.parseInt(userInfo[2]);
        double weight = Double.parseDouble(userInfo[3]);

        double bmi = calculateBMI(heightFeet, heightInches, weight);
        String weightStatus = getWeightStatus(bmi);

        displaySummary(fullName, bmi, weightStatus);
        displayBMITable(fullName, heightFeet, heightInches, weight);
        displayEndingMessage(fullName);
    }

    public static void main(String[] args) {
        BMI_CSC215_English_AJArce program = new BMI_CSC215_English_AJArce();
        program.runProgram();
    }
}