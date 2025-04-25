
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro  extends World
{

    public intro()

    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        setPaintOrder(mario.class);
        addObject(new tubo(2),976,493);
        addObject(new mario(),591,370);
        global.variables.tiempos=0;
        global.variables.j=-1;
        for(int i=18;i<23;i++)
        {
            addObject(new ground(),i*30+10,402);
        }
        for(int c=0;c<35;c++)
        {
            addObject(new ground(),c*30+10,528);
        }
        prepare();
    }

    public void act()
    {
        if(global.variables.j==0)
            Greenfoot.setWorld(new World1());
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
