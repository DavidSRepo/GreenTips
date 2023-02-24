import kareltherobot.*;
public class MazeBot extends SmartBot
{
    public MazeBot (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    public boolean rightIsClear()
    {
        turnRight();
        if (frontIsClear())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    public boolean leftIsClear()
    {
        turnLeft();
        if (frontIsClear())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void wallFlower()
    {
        if (!rightIsClear() && !frontIsClear())
        {
            turnLeft();
        }
        else if (!rightIsClear() && frontIsClear())
        {
            move();
            turnRight();
            move();
        }
        else if (!rightIsClear() && frontIsClear())
        {
            move();
            if (rightIsClear())
            {
                turnRight();
                move();
                turnRight();
                move();
            }
            else 
            {
                move();
            }
        }
    }
}
            