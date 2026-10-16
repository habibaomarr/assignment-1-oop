package com.mycompany.assigement1Q3;
import java.util.Scanner;
public class assigement1Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first score: ");
        int score1 = scan.nextInt();

        System.out.print("Enter second score: ");
        int score2 = scan.nextInt();

        System.out.print("Enter third score: ");
        int score3 = scan.nextInt();

        double sum = score1 + score2 + score3;
        double average = sum / 3.0;

        System.out.println("Average = " + average);
    }
}