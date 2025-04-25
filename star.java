import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class star extends Actor
{
    int n;
    public void act() 
    {
        if(n==3)
        n=0;
        else
        n++;
        setImage("est"+n+".png");
        if(isTouching(mario.class))
         {
             mario mono=(mario)getOneIntersectingObject(mario.class);
             getWorld().addObject(new starMario(),mono.getX(),mono.getY());
             removeTouching(mario.class);
             getWorld().removeObject(this);
            }
    }    
}
