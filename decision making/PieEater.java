import java.util.Scanner;
public class PieEater{
    public static void main (String argz[]){
        Scanner scan = new Scanner (System.in);
        int Weight;
        
        System.out.println("What is your weight?");
        Weight = scan.nextInt();
        
        if (Weight>=220 && Weight<=280)
        System.out.println("Pick a seat.");
        else
        System.out.println("Sorry, you're out of weight");
    }
}