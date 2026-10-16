
import java.util.Scanner;
public class assignement1Question4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int days = scan.nextInt();
        
        int weeks = days / 7;
        int remainingDays = days % 7;
        
        System.out.println(weeks + " weeks and " + remainingDays + " days");
    }
}