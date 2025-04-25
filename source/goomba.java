import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goomba extends Actor
{
    int n,actos=60,factos=0;
    int v=3;
    double speed=1.5,g=8;
    public void act() 
    {
        if(factos==0)
        {
            setImage("hongose"+n+".png");
            if(n==1)
            n=0;
            else
            n++;
            factos=10;
        }
        factos--;

        actos--;
        if(actos==0||isAtEdge())
        {
        v*=-1;
        actos=60;
    }
     setLocation(getX()+v,getY());
     checkFall();
}
public boolean onGround()
    {
        Actor under=getOneObjectAtOffset(0,17,ground.class);
        return under!=null;
    }
    public boolean onEmpty()
    {
        Actor under=getOneObjectAtOffset(0,17,empty.class);
        return under!=null;
    }
    public void checkFall()
    {
        if(onGround()||onEmpty())
        {
            speed=0;
            g=7.5;
        }
        else 
        fall();
    }
     public void fall()
    {
       setLocation(getX(),(int)(getY()+speed));
       speed+=0.159; 
       g-=0.1;
    }
}
