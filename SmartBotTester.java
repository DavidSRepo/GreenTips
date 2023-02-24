import kareltherobot.*;
import java.awt.Color;
public class SmartBotTester implements Directions
{
public static void main(String args[])
{
        SmartBot lenny = new SmartBot (1,1,South,10000);
        lenny.faceEast();
        lenny.faceWest();
        lenny.faceNorth();
        lenny.moveHalfMile();
        lenny.turnRight();
        lenny.moveHalfMile();
        lenny.beeperIsToRight();
         
        lenny.move();
        lenny.turnRight();
        lenny.move();
        lenny.move();
        lenny.turnRight();
        lenny.move();
        lenny.beeperIsToLeft();
        lenny.turnRight();
        lenny.move();
        lenny.move();
        lenny.move();
        lenny.turnLeft();
        lenny.move();
        lenny.twoBeepersOrMoreOnCorner();
       //put your code here for your client
        
}
static {
        
        World.readWorld("beeps.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(30);  
        World.setVisible(true);
    }
}
