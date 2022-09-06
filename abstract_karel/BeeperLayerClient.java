
import kareltherobot.*;
import java.awt.Color;

public class BeeperLayerClient implements Directions
{
public static void main(String [] args) 
{	BeeperLayer lisa=null;
	lisa = new TwoRowLayer(2, 3 ,East, infinity);
	lisa.layBeepers(); 
	lisa = new ThreeRowLayer(3, 3, East, infinity);
	lisa.layBeepers();
	lisa = new TwoRowLayer(4, 3, East, infinity);
	lisa.layBeepers(); 
	lisa = new ThreeRowLayer(5, 3, East, infinity);
	lisa.layBeepers();
	lisa = new TwoRowLayer(6, 3, East, infinity);
	lisa.layBeepers(); 
}
static {
        
        World.readWorld("blank.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}


