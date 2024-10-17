/*

File: BMI_CSC215_Master_AJArce.java
By: A.J Arce
Date: September 26th, 2024

Description: This is the master version of the BMI program, which changes it's formulas for calculating BMI based off which version the user chooses. There are two version the English and Metric. It also displays a table of BMI's in a certain range the user chooses.

*/
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BMI_Master_AJArce {
    Scanner input = new Scanner(System.in);
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);

    public void welcomeMessage(String version) {
        String border = "---------------------------------------------------------------------------------------------";
        System.out.println(border);
        System.out.println("-- Welcome to:");
        System.out.println("--            BODY MASS INDEX (BMI) Computation, CSC 215, " + version + " version");
        System.out.println("--                                                                  by AJ Arce");
        System.out.println(border);
    }

    public String applyYellowBackground(String text) {
        final String YELLOW_BACKGROUND = "\u001B[43m";
        final String BLACK_TEXT = "\u001B[30m";
        final String RESET = "\u001B[0m";
        return YELLOW_BACKGROUND + BLACK_TEXT + text + RESET;
    }
    public void displayEndingMessage(String fullName) {
        String message;
        String lowerCaseName = fullName.toLowerCase();
        if (lowerCaseName.equals("otto minion")) {
            message = "Poopaye!!!";
        } else if (lowerCaseName.equals("minnie mouse")) {
            message = "Ear-esistible!!!";
        } else if (lowerCaseName.equals("baymax hamada")) {
            message = "Sayōnara!!!";
        } else if (lowerCaseName.equals("goofy dog")) {
            message = "Woof Woof!!!";
        } else {
            message = "Have a great day!";
        }
        String border = "---------------------------------------------------------------------------------------------";
        System.out.println(border);
        System.out.println("-- Thank you for using my program, " + fullName +"!");
        System.out.println("-- " + message);
        System.out.println(border);
    }

    public String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return  "Healthy Weight";
        } else if (bmi < 29.9) {
            return  "Overweight";
        } else {
            return "Obesity";
        }
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
                return "%-10.2f";
        }
    }

    public String [] getUserInfoMetric() {
        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Please enter height in centimeters for " + fullName + ": ");
        double heightInCentimeters = input.nextDouble();

        System.out.print("Please enter weight in kilograms for " + fullName + ": ");
        double weight = input.nextDouble();

        return new String[] {fullName, String.valueOf(heightInCentimeters), String.valueOf(weight)};
    }

    public double calculateBMIMetric(double heightInCentimeters, double weight) {
        double height = heightInCentimeters * 0.01;
        return (weight / (height * height));
    }

    public void displaySummaryMetric(String fullName, double bmi, String weightStatus) {
        System.out.println("-- SUMMARY REPORT for " + fullName.toUpperCase());
        System.out.println("-- Date and Time:     " + formattedDateTime);
        System.out.printf("-- BMI:               %.2f\n", bmi);
        System.out.println("-- Weight Status:     " + weightStatus);
    }

    public double[] lowAndHighWeightMetric(String fullName) {
        System.out.printf("Please enter a LOW weight in kilograms for " + fullName + ": ");
        double lowWeight = input.nextDouble();
        System.out.printf("Please enter a HIGH weight in kilograms for " + fullName + ": ");
        double hightWeight = input.nextDouble();
        return new double[] {lowWeight, hightWeight};
    }

    public void displayBMITableMetric(String fullName, double height, double weight) {
        double[] weights = lowAndHighWeightMetric(fullName);
        double lowWeight = weights[0];
        double highWeight = weights[1];
        double tableWeight = lowWeight;
        boolean isFirstRow = true;
        boolean userWeightPrinted = false;

        System.out.println("--------------------------------------------------------------");
        System.out.println("|  WEIGHT      |     BMI     |  WEIGHT STATUS                |");
        System.out.println("--------------------------------------------------------------");

        while (tableWeight <= highWeight) {
            double bmi = calculateBMIMetric(height, tableWeight);
            String weightStatus = getWeightStatus(bmi);

            String formatString = getDecimalFormatByStatus(weightStatus);

            if (!userWeightPrinted && tableWeight >= weight) {
                double userBMI = calculateBMIMetric(height, weight);
                String userWeightStatus = getWeightStatus(userBMI);
                String userFormatString = getDecimalFormatByStatus(userWeightStatus);
                System.out.printf("|  %-12.2f |  " + userFormatString + " |  %-18s%-5s    |\n", weight, userBMI, userWeightStatus, "(this)");
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

        double highWeightBMI = calculateBMIMetric(height, highWeight);
        String highWeightStatus = getWeightStatus(highWeightBMI);
        String highWeightFormatString = getDecimalFormatByStatus(highWeightStatus);

        if (!userWeightPrinted && highWeight == weight) {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", weight, highWeightBMI, highWeightStatus, "(this)");
        } else {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", highWeight, highWeightBMI, highWeightStatus, applyYellowBackground("(HIGH)"));
        }

        System.out.println("--------------------------------------------------------------");
    }


    public String[] getUserInfoEnglish() {
        System.out.print("Please entr your full name: ");
        String fullName = input.nextLine();

        System.out.print("Please enter your height in feet and inches for " + fullName + ": ");
        int heightFeet = input.nextInt();
        int heightInches = input.nextInt();

        System.out.print("Please enter weight in pounds for " + fullName + ": ");
        double weight = input.nextDouble();

        return new String[] {fullName, String.valueOf(heightFeet), String.valueOf(heightInches), String.valueOf(weight)};
    }

    public double calculateBMIEnglish(int heightFeet, int heightInches, double weight) {
        int totalHeightInInches = (heightFeet * 12) + heightInches;
        return (weight / (totalHeightInInches * totalHeightInInches)) * 703;
    }

    public void displaySummaryEnglish(String fullName, double bmi, String weightStatus) {
        System.out.println("-- SUMMARY REPORT for " + fullName.toUpperCase());
        System.out.println("-- Date and Time:     " + formattedDateTime);
        System.out.printf("-- BMI:               %.2f\n", bmi);
        System.out.println("-- Weight Status:     " + weightStatus);
    }

    public double[] lowAndHighWeightEnglish(String fullName) {
        System.out.printf("Please enter a LOW weight in pounds for " + fullName + ": ");
        double lowWeight = input.nextDouble();
        System.out.printf("Please enter a HIGH weight in pounds for " + fullName + ": ");
        double highWeight = input.nextDouble();
        return new double[] {lowWeight, highWeight};
    }

    public void displayBMITableEnglish(String fullName, int heightFeet, int heightInches, double userWeight) {
        double[] weights = lowAndHighWeightEnglish(fullName);
        double lowWeight = weights[0];
        double highWeight = weights[1];
        double tableWeight = lowWeight;
        boolean isFirstRow = true;
        boolean userWeightPrinted = false;

        System.out.println("--------------------------------------------------------------");
        System.out.println("|  WEIGHT (lbs) |     BMI     |  WEIGHT STATUS               |");
        System.out.println("--------------------------------------------------------------");

        while (tableWeight < highWeight) {
            double bmi = calculateBMIEnglish(heightFeet, heightInches, tableWeight);
            String weightStatus = getWeightStatus(bmi);

            String formatString = getDecimalFormatByStatus(weightStatus);

            if (!userWeightPrinted && tableWeight >= userWeight) {
                double userBMI = calculateBMIEnglish(heightFeet, heightInches, userWeight);
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

        double highWeightBMI = calculateBMIEnglish(heightFeet, heightInches, highWeight);
        String highWeightStatus = getWeightStatus(highWeightBMI);
        String highWeightFormatString = getDecimalFormatByStatus(highWeightStatus);

        if (!userWeightPrinted && highWeight == userWeight) {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", userWeight, highWeightBMI, highWeightStatus, "(this)");
        } else {
            System.out.printf("|  %-12.2f |  " + highWeightFormatString + " |  %-18s%-5s    |\n", highWeight, highWeightBMI, highWeightStatus, applyYellowBackground("(HIGH)"));
        }

        System.out.println("--------------------------------------------------------------");
        }

        public void runProgram() {
            System.out.println("My CSC 215 BMI Calculator Projects: ");
            System.out.println("   1. BMI, English");
            System.out.println("   2. BMI, Metric");
            System.out.println();
            System.out.println("[ USER MANUAL ] Enter an exclamation mark ! to end.");

            System.out.print("Please enter the version you want to try: ");
            String choice = input.nextLine().trim().toLowerCase();
            if (choice.startsWith("m")) {
                choice = "metric";
            } else if (choice.startsWith("e")) {
                choice = "english";
            }

            switch (choice) {
                case "metric":
                    welcomeMessage("Metric");
                    String[] userInfoMetric = getUserInfoMetric();
                    String fullNameMetric = userInfoMetric[0];
                    double heightMetric = Double.parseDouble((userInfoMetric[1]));
                    double weightMetric = Double.parseDouble(userInfoMetric[2]);

                    double bmiMetric = calculateBMIMetric(heightMetric, weightMetric);
                    String weightStatusMetric = getWeightStatus(bmiMetric);

                    displaySummaryMetric(fullNameMetric, bmiMetric, weightStatusMetric);
                    displayBMITableMetric(fullNameMetric, heightMetric, weightMetric);
                    displayEndingMessage(fullNameMetric);
                    break;

                case "english":
                    welcomeMessage("English");
                    String[] userInfoEnglish = getUserInfoEnglish();
                    String fullNameEnglish = userInfoEnglish[0];
                    int heightFeet = Integer.parseInt(userInfoEnglish[1]);
                    int heightInches = Integer.parseInt(userInfoEnglish[2]);
                    double weightEnglish = Double.parseDouble(userInfoEnglish[3]);

                    double bmiEnglish = calculateBMIEnglish(heightFeet, heightInches, weightEnglish);
                    String weightStatusEnglish = getWeightStatus(bmiEnglish);

                    displaySummaryEnglish(fullNameEnglish, bmiEnglish, weightStatusEnglish);
                    displayBMITableEnglish(fullNameEnglish, heightFeet, heightInches, weightEnglish);
                    displayEndingMessage(fullNameEnglish);
                    break;

                case "!":
                    System.out.println("Goodbye, try the program soon!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input. Please restart the program and choose either 'Metric', 'English', or '!' to exit.");
                    break;
            }
        }

        public static void main(String[] args) {
        BMI_Master_AJArce program = new BMI_Master_AJArce();
        program.runProgram();
        }
    }