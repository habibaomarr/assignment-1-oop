

import java.util.Scanner;

public class Javaapplicationassignment1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        double pi = 3.14159;
        
        System.out.print("Enter the radius: ");
        double radius = Scan.nextDouble();
        
        double area = pi * Math.pow(radius, 2);
        double circumference = 2 * pi * radius;
        
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}