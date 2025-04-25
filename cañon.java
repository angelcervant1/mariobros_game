import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cañon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cañon extends Actor
{
    int v=-6;
    public void act() 
    {
        move(v);
        if(isAtEdge())
        {
            v*=-1;
            turn(90);
        }
    }    
}
