import kareltherobot.*;
public class BetterRobot extends Robot
{
    public BetterRobot (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    public void moveMile( )
        {
            move();
            move();
            move();
            move();
            move();
            move();
            move();
            move();
        }
    public void turnRight( )
        {
            turnLeft();
            turnLeft();
            turnLeft();
        }
    public void turnAround( )
    {
        turnLeft();
        turnLeft();
    }
    public void moveDecaMile( )
    {
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
        moveMile();
    }
    public void moveHalfMile( )
    {
        move();
        move();
        move();
        move();
}
}

