
import kareltherobot.*;
import java.awt.Color;
public class BetterRobotTester implements Directions
{
    public static void main (String args[])
    {
       BetterRobot lenny = new BetterRobot(2,1,North,0);
       lenny.turnRight();
       lenny.moveMile();
       lenny.turnAround();
       lenny.exit();
       lenny.turnRight();
       lenny.moveDecaMile();
       lenny.turnAround();
       lenny.moveDecaMile();
       lenny.turnAround();
       lenny.turnOff();
    }
    static {
        World.reset(); 
        World.readWorld("MountainPeakWorld.kwld"); 
        World.setBeeperColor(Color.green);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}
