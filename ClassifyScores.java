
/**
 * Program Name: ClassifyScores
 * Author: Pup Abdulgapul
 * Student ID: 100362791
 * Date: Oct 28, 2022
 * Course: CPSC1150-03
 * Professor: Hengameh Hamavand
 */

import java.util.Scanner;

public class ClassifyScores { // Program to categorize user-inputted test scores according to ranges
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ranges = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean running = true;
        int score;
        System.out.println("This program displays the number of scores for each range. ");
        System.out.println("The ranges are as follows: ");
        System.out.println("0-9\n10-19\n20-29\n30-39\n40-49\n50-59\n60-69\n70-79\n80-89\n90-100");
        System.out.println("Enter in your scores. To stop the program, enter in a negative score. ");

        do { // run this until user wants to stop
            System.out.println("\nPlease enter in the next score: ");
            score = input.nextInt();
            running = getRange(score, ranges); 
        } while (running); //set this to false to stop
        System.out.println("\n\nHere are the ranges for the scores entered.");
        displayArray(ranges);
    }

    /**
     * Method to display the array of score ranges
     * 
     * @param a is the array being passed through to method
     */
    public static void displayArray(int[] a) {
        System.out.println("Range  Number of scores");
        System.out.println(" 0-9          " + a[0]);
        System.out.println("10-19         " + a[1]);
        System.out.println("20-29         " + a[2]);
        System.out.println("30-39         " + a[3]);
        System.out.println("40-49         " + a[4]);
        System.out.println("50-59         " + a[5]);
        System.out.println("60-69         " + a[6]);
        System.out.println("70-79         " + a[7]);
        System.out.println("80-89         " + a[8]);
        System.out.println("90-100        " + a[9]);
    }

    /**
     * Method to sort the inputted scores into appropriate ranges
     * @param num is the score being passed thru
     * @param a is the array of grade ranges
     * @return false if negative number entered, otherwise true to keep running program
     */
    public static boolean getRange(int num, int[] a) {
        if (num < 0) {
            return false; //should set running to false if negative number entered
        } else if (num > 100) {
            System.out.println("Error, maximum score must be 100. ");
            return true;
        }

        else {
            num = num / 10;
            switch (num) {
                case 0:
                    a[0] += 1;
                    break;
                case 1:
                    a[1] += 1;
                    break;
                case 2:
                    a[2] += 1;
                    break;
                case 3:
                    a[3] += 1;
                    break;
                case 4:
                    a[4] += 1;
                    break;
                case 5:
                    a[5] += 1;
                    break;
                case 6:
                    a[6] += 1;
                    break;
                case 7:
                    a[7] += 1;
                    break;
                case 8:
                    a[8] += 1;
                    break;
                case 9:
                    a[9] += 1;
                    break;
                case 10:
                    a[9] += 1;
                    break;
            }
            return true;
        }
    }
}