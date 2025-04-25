import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goombaDead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goombaDead extends Actor
{
    int actos=20;
    public void act() 
    {
        actos--;
        if(actos==0)
        {
        getWorld().removeObject(this);
        actos=20;
    }
    }    
}
