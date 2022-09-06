import java.util.Scanner;
public class LifeTheGame{
    public static void main (String argz[]){
        Scanner scan = new Scanner (System.in);
        int Strength, Health, Luck, TotalStats;
        
        
        System.out.println("What is your charecter's name?");
        String Name = scan.nextLine();
        System.out.println("How strong are you? (1-10)");
        Strength = scan.nextInt();
        System.out.println("How healthy are you? (1-10)");
        Health = scan.nextInt();
        System.out.println("How lucky are you? (1-10)");
        Luck = scan.nextInt();
        
        TotalStats = Strength+Health+Luck;
        
        if (15>=TotalStats)
        System.out.println("Welcome to life");
        else
        System.out.println("You have given your charecter too many points! Defult values have been assigned: Strength: 5, Health; 5, Luck; 5");
    }
}
   