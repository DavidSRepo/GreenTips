import java.util.Scanner;
public class Bank{
    public static void main (String argz[]){
        Scanner scan = new Scanner (System.in);
        int Checking, Saving ;
        
        System.out.println("How much is in your checking?");
        Checking = scan.nextInt();
        
        System.out.println("How much is in you savings");
        Saving = scan.nextInt();
        
        if (Checking>=1000 || Saving>= 1500)
        System.out.println("No service charge required.");
        else
        System.out.println("Applying a service charge of $0.15 per check ");
    }
}