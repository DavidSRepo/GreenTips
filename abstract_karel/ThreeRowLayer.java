import kareltherobot.*;

public class ThreeRowLayer extends BeeperLayer
{
public ThreeRowLayer  (int st, int av, Direction dir, int beepers )
    {
     super(st, av, dir, beepers);
    }

   public void putBeepers(){
    putBeeper();
    putBeeper();
    putBeeper();
   }
}