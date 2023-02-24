import kareltherobot.*;
import java.awt.Color;
public class RacerBot implements Directions
{
     public static void main(String [] argz)
     {
         SmartBot lenny = new SmartBot(1,1,East,8);
         lenny.raceStride();
         lenny.raceStride();
         lenny.raceStride();
         lenny.raceStride();
         lenny.raceStride();
         lenny.raceStride();
        }
        static {
        
        World.readWorld("fig5-5.kwld"); 
        World.setBeeperColor(Color.blue);
        World.setStreetColor(Color.white);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(30);  
        World.setVisible(true);
    }
}
