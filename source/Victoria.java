import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Victoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Victoria extends World
{

    /**
     * Constructor for objects of class Victoria.
     * 
     */
    public Victoria()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1); 
        addObject(new castillo(),600,249);
        addObject(new mario(),125,308);
        addObject(new peach(),470,310);
        addObject(new bush(),56,304);
        addObject(new bush(),400,304);
        addObject(new bush(),780,304);
        
        for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
    }
}
