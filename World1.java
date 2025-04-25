
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
    
    int n=30;
       
    public World1()
    
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1); 
        global.variables.pts=0;
        addObject(new mario(),45,308);
        addObject(new tubo(2),789,40);
        addObject(new bush(),276,304);
        addObject(new bush(),610,303);
        addObject(new bush(),634,195);
        addObject(new cloud(),396,194);
        addObject(new bloquepoder(),315,230);
        addObject(new cloud(),60,100);
        addObject(new toad(),771,190);
        setPaintOrder(Dead.class,mario.class,end.class,ground.class,cañon.class,goomba.class,cloud.class,toad.class,hongo.class);
        global.variables.toads=0;
        for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int i=0;i<6;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
             for(int i=20;i<40;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
             for(int i=10;i<40;i++)
            {
                addObject(new ground(),i*30+10,80);
            }
            addObject(new koopa(),30,199);
            addObject(new koopa(),460,49);
            addObject(new cañon(),761,123);
            addObject(new coin(),772,302);
            addObject(new coin(),23,191);
            addObject(new goomba(),659,199);
             addObject(new goomba(),382,310);
    }
    public void act()
    {
        if(global.variables.j==1)
        {
            removeObjects(getObjects(bloquepoder.class));
            removeObjects(getObjects(vacio.class));
        Greenfoot.setWorld(new World2());
    }
        showText("Score: "+global.variables.pts,65,30);
        showText("Toads: "+global.variables.toads,180,30);
    }
}
