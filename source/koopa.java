import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koopa extends Actor
{
    double speed=1.5,g=8;
    int v=2;
    int actos=70;
    public void act() 
    {
        actos--;
        
        if(actos==0||isAtEdge())
        {
            v*=-1;
            actos=70;
        }
        if(v<0)
        setImage("tortu0"+".png");
        else
        setImage("tortu1"+".png");
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
    public boolean onVacio()
    {
        Actor under=getOneObjectAtOffset(0,17,vacio.class);
        return under!=null;
    }
    public void checkFall()
    {
        if(onGround()||onEmpty()||onVacio())
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
