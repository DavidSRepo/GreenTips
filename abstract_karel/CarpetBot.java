import kareltherobot.*;
import java.awt.Color;
public class CarpetBot implements Directions
{
     public static void main(String [] argz)
     {
         SmartBot lenny = new SmartBot(1,1,East,8);
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
      lenny.Carpenter();
        }
        static {
        
        World.readWorld("ch5_11.kwld"); 
        World.setBeeperColor(Color.blue);
        World.setStreetColor(Color.white);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}
       