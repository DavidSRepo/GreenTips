import java.util.Scanner;
public class Repeat
{
    public static void main (String[] args)
    {
       
        Scanner scan = new Scanner (System.in);
        String inputString; 
        int  times;
        
        System.out.println("Enter a word:");
        inputString = scan.nextLine();
        times = inputString.length();
        
        times = inputString.length();
        
        for (int i=1; i<=times; i++)
        {
            System.out.println(inputString);
        }
    }
}
        
    