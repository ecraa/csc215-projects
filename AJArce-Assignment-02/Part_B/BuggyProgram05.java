import java.util.Scanner;

public class DebugProgram5 {

    public static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {

        // This program counts up by a certaim amount until it reaches a specified number
        System.out.print("Starting Number: ");
        double startNum = input.nextDouble()

        System.out.print("Number to count up with: ");
        int numToAdd = input.nextInt();

        System.out.print("Number to stop counting at: ");
        double endNum = input.nextDouble();

        double currentNum = startNum;
        int i = 0;
        while(false) {

            if(i == endNum) {
                System.out.println("Finished counting... Exiting");
            }

            System.out.printf("This run: %d | Original Number: %f | Current Number: %f \n", i, startNum, currentNum);

            startNum -= numToAdd;
            i++;
        }


        

    }


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
