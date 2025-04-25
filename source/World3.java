
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World3 extends World
{
    mario mono=new mario();
    int n=30;
    public World3()
    
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1);
        addObject(mono,25,72);
        addObject(new toad(),696,90);
        setPaintOrder(Dead.class,mario.class,end.class,vacio.class,goomba.class,cloud.class,toad.class,ground.class);
        //Greenfoot.playSound("ringtones-super-mario-bros.wav");
        global.variables.v=4;
        
            for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int i=5;i<12;i++)
            {
                addObject(new ground(),i*30+10,180);
            }
             for(int i=20;i<24;i++)
            {
                addObject(new ground(),i*30+10,130);
            }
             for(int i=15;i<19;i++)
            {
                addObject(new ground(),i*30+10,245);
            }
            
             for(int i=-1;i<4;i++)
            {
                addObject(new empty(),i*30+45,104);
            }
            addObject(new koopa(),495,214);
            addObject(new goomba(),265,310);
            addObject(new cañon(),674,208);
            addObject(new koopa(),157,150);
            addObject(new coin(),64,175);
            addObject(new pinchi(),655,103);
            addObject(new planta(),370,149);
            addObject(new bush(),218,144);
            addObject(new bush(),94,304);
            addObject(new bush(),338,305);
            addObject(new plantab(),103,134);
            addObject(new tubo(2),792,301);
            addObject(new hongo(),64,261);
            addObject(new vacio(),370,180);
            addObject(new vacio(),104,104);
            addObject(new bloquepoder(),494,129);
    }
    public void act()
    {
        if(global.variables.j==3)
        Greenfoot.setWorld(new World4());
        showText("Score: "+global.variables.pts,80,30);
        showText("Toads: "+global.variables.toads,180,30);
    }
}
