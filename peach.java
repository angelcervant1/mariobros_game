import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peach extends Actor
{
    int actos=60;
    boolean band=false;
    public void act() 
    {
        if(actos==0)
        {
        setImage("princesa1"+".png");
        actos=-1;
    }
    actos--;
    if(actos==-60)
    {
    setImage("princesa"+".png");
    band=true;
}
    if(band==true)
    move(2);
    if(getX()>600)
        getWorld().removeObject(this);
    }    
}
