import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends Actor
{
    int n,actos;
    public void act() 
    {
        if(n==3)n=0;
        if(actos==0)
        {
        setImage("Coin"+n+".png");
        n++;
        actos=3;
    }
    actos--;
    }    
}
