import kareltherobot.*;
import java.awt.Color;
public class LoopBotTester implements Directions
{
    public static void main(String [] argz)
    {
        LoopBot lenny = new LoopBot ( 5,2,South,0);
        lenny.findBeeper();
    }
    static {
        
        World.readWorld("fig6-8.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(30);  
        World.setVisible(true);
    }
}