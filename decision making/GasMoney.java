import java.util.Scanner;
public class GasMoney{
    public static void main (String[] argz){
    Scanner scan = new Scanner (System.in);
    int TankCapacity, GageReading, MilesPerGallon, TotalMiles;
    
    System.out.println("What is your tank capacity?");
    TankCapacity = scan.nextInt(); 
    
    System.out.println("What is the gage reading? (0-100)");
    GageReading = scan.nextInt();
    
    System.out.println("What is the miles per gallon of the vehicle?");
    MilesPerGallon = scan.nextInt();
    
    TotalMiles = (TankCapacity*GageReading)/100*MilesPerGallon;
    
    if (TotalMiles < 200)
    System.out.println("Get Gas.");
    else
    System.out.println("Safe to Proceed");
}
}