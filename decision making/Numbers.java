import java.util.Scanner;
public class Numbers{
    public static void main (String argz[]){
        Scanner scan = new Scanner (System.in);
        int X;
        System.out.println("Type a number:");
        X = scan.nextInt();
        if (X%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}

        