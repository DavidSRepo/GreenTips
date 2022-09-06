import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		int x1, x2, y1, y2;
		  System.out.println("What is the x1?");
		  x1 = scan.nextInt();
		  System.out.println("What is the x2?");
		  x2 = scan.nextInt();
		  System.out.println("What is the y1?");
		  y1 = scan.nextInt();
		  System.out.println("What is the y2?");
		  y2 = scan.nextInt();
		
		
		Distance distance = new Distance (x1, x2, y1, y2);
		System.out.println(distance);
		
			
	}
}