import java.util.Scanner;
public class Numbers2
{
    public static void main (String[] argz )
    {
        Scanner scan = new Scanner (System.in);
        int x,y;
        System.out.println("Enter Start:");
        x = scan.nextInt();
        
        System.out.println("Enter End:");
        y = scan.nextInt();
        
        for (int i=x; i<=y; i++)
        {
            System.out.println("Count is:" + i);
        }
    }
}