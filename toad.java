import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class toad extends Actor
{
    /**
     * Act - do whatever the toad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if(isTouching(mario.class))
        {
        global.variables.toads++;
        Greenfoot.playSound("mario-bros vida.wav");
            getWorld().removeObject(this);
    }
 
    }    
}
