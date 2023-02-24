import kareltherobot.*;
public class LoopBot extends SmartBot
{
    public LoopBot (int st, int av, Direction dir, int beeps) 
    {
        super (st, av, dir, beeps);
    }
    public void findBeeper ()
    {
        while (!nextToABeeper())
        if (frontIsClear())
        {
            move();
            if (!frontIsClear())
            {
                turnLeft();
            }
        }
    }
    public void emptyBeeperBag()
    {
        
    }
    public void move5()
    {
        for (int i=1; i<5; i++)
        {
        move();
    }
    }
    public void buildWall (int n)
    {
        for (int i=1; i<=5; i++)
        {
            putBeeper();
            move();
        }
    }    
}
                