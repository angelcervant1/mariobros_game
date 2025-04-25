import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tubo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud extends Actor
{
    int v=2,actos=60;
    public void act() 
    {
        move(v);
        actos--;
        if(actos==0)
        {
            v*=-1;
            actos=60;
        }
    }    
}
