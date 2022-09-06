import java.util.Scanner;
public class TirePressure{
    public static void main (String argz[]){
        Scanner scan = new Scanner (System.in);
         int RightFront, LeftFront, RightBack, LeftBack;
         
         System.out.println("What's the pressure of the front right tire?");
         RightFront = scan.nextInt();
         System.out.println("What's the pressure of the front left tire?");
         LeftFront = scan.nextInt();
         System.out.println("What's the pressure of the back right tire?");
         RightBack = scan.nextInt();
         System.out.println("What's the pressure of the back left tire?");
         LeftBack = scan.nextInt();
         
         if (RightFront == LeftFront &&LeftBack==RightBack)
         System.out.println("Inflation is Ok");
         else
         System.out.println("Check tire pressure.");
        }
    }
         