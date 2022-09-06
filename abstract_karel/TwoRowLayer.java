import kareltherobot.*;

public class TwoRowLayer extends BeeperLayer
{
public TwoRowLayer  (int st, int av, Direction dir, int beepers )
    {
     super(st, av, dir, beepers);
    }

   public void putBeepers(){
    putBeeper();
    putBeeper();
   }
}