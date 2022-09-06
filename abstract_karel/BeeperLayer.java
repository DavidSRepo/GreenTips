import kareltherobot.*;

abstract class BeeperLayer extends UrRobot
{
    public BeeperLayer  (int st, int av, Direction dir, int beepers )
    {
     super(st, av, dir, beepers);
    }
    
    public void layBeepers(){
    move();
    putBeepers();
    move();
    putBeepers();
    move();
    putBeepers();
    move();
    putBeepers();
    move();  
    turnOff();
    }
    
    public abstract void putBeepers();
}