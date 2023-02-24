import kareltherobot.*;
public class SmartBot extends BetterRobot
{
    public SmartBot (int st, int av, Direction dir, int beeps)
    {
        super(st, av, dir, beeps);
    }
    public boolean beeperIsToLeft()
    {
        turnLeft();
        move();
        if(nextToABeeper())
        {
            turnLeft(); turnLeft(); move(); turnLeft();
            return true;
        }
        turnLeft(); turnLeft(); move(); turnLeft();
        return false;
    }
    public boolean beeperIsToRight()
    {
        turnRight();
        move();
        if (nextToABeeper())
        {
            turnRight(); turnRight(); move(); turnRight();
            return true;
        }
        turnRight(); turnRight(); move(); turnRight();
        return false;
    }
    public void faceEast()
    {
    if (facingEast())
    {
        turnRight();
        turnRight();
        turnRight();
        turnRight();
        
    }
    else if (facingWest())
    {
        turnAround();
     
    }
    else if (facingNorth())
    {
        turnRight();
       
    }
    else 
    {
        turnLeft();
      
    }
}
   public void faceWest()
    {
    if (facingWest())
    {
        turnRight();
        turnRight();
        turnRight();
        turnRight();
   
    }
    else if (facingEast())
    {
        turnAround();
       
    }
    else if (facingNorth())
    {
        turnLeft();
        
    }
    else 
    {
        turnRight();
       
    }
}
public void faceNorth()
    {
   if (facingSouth())
    {
        turnAround();
        
    }
    else if (facingWest())
    {
        turnRight();
        
    }
    else 
    {
        turnLeft();
        
    }
}
public void faceSouth()
    {
     if (facingNorth())
    {
        turnAround();
      
    }
    else if (facingEast())
    {
        turnRight();
       
    }
    else 
    {
        turnLeft();
        
    }
}
public boolean twoBeepersOrMoreOnCorner()
{
    if (nextToABeeper())
    {
        pickBeeper();
        if (nextToABeeper())
        {return true;
    }
    return false;
}
else 
{
return false;
}
}
public void exit()
{
   faceSouth();
    move();
    turnLeft();
}
public void Carpenter()
{
    move();
    turnLeft();
    move();
    if (!frontIsClear())
    {
        turnLeft();
    if (!frontIsClear())
        {
            turnAround();
                if (!frontIsClear())
                {
                    putBeeper();
                    
                }
        }
    }
    
    
        exit();
}
public void raceStride()
{
    if (frontIsClear())
    {
    move();
}
    else 
    {
    jump();
}
}
public void jump()
{
    jumpUp();
    move();
    glideDown();
}
public void jumpUp()
{
    turnLeft();
    move();
    move();
    faceEast();
}
public void glideDown()
{
    if(frontIsClear())
    {
        turnRight();
        move();
    }
    else 
    {
        turnRight();
    
}
}
}