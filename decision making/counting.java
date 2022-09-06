import java.util.Scanner;
public class counting
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner (System.in);
      int  x, y;   
    System.out.println("Pick a number.");
    x = scan.nextInt();
    
    System.out.println("Now, pick another.");
    y = scan.nextInt();
         
    while ( x <= y )   
    {
      System.out.println( "count is:" + x );
      x = x + 1;    
    }
  }
}