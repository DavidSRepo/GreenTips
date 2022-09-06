// TextLab04st.java
// The Geometry Class Program
// This is the student, starting version of Text Lab 04.
// 4 Geometry class methods are provided as an example.
// You need to write the other 20 on your own.
import java.util.Scanner;
public class TextLab04st
{
	public static double side, length, width, height, base1, base2, radius;
	
	public static void main (String args[]) 						
	{   
		System.out.println("\nTextLab04\n\n");
		enterData();
		Geometry geometry = new Geometry(side, length, width, height, base1, base2, radius);
		geometry.display2DPerimeters();
		geometry.display2DAreas();
		geometry.display3DSurfaceAreas();
		geometry.display3DVolumes();			
	}
	
	public static void enterData() 						
	{	Scanner scan = new Scanner(System.in);
		System.out.print("Enter  Side     ===>>  ");										
		side = scan.nextDouble();
		System.out.print("Enter  Length   ===>>  ");										
		length = scan.nextDouble();
		System.out.print("Enter  Width    ===>>  ");										
		width = scan.nextDouble();
		System.out.print("Enter  Height   ===>>  ");										
		height = scan.nextDouble();
		System.out.print("Enter  Base1    ===>>  ");										
		base1 = scan.nextDouble();
		System.out.print("Enter  Base2    ===>>  ");										
		base2 = scan.nextDouble();
		System.out.print("Enter  Radius   ===>>  ");										
		radius = scan.nextDouble();
		
	}

// Remove comments from the println statements below as you complete each of the methods of the Geometry class.
// Leave comments in place for any methods that you have not finished.

	
	
	
}




	
	