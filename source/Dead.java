import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dead extends Actor
{
    double speed=-8,g=8;
    /**
     * Act - do whatever the Dead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
       setLocation(getX(),(int)(getY()+speed));
       speed+=0.32; 
       g-=0.54;
       if(isAtEdge())
       Greenfoot.stop();
    }    
}
