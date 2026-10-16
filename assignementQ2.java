package assignement1Q2;

import java.util.Scanner;

public class assignementQ2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter unit price: ");
        double unitPrice = scan.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();
        
        double taxRate = 0.14;
        
        double subtotal = unitPrice * quantity;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        
        System.out.println("Subtotal = " + subtotal + ", Tax = " + tax + ", Total = " + total);
    }
}