
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    mario mono=new mario();
    int n=30;
    public World2()
    
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1);
        addObject(mono,45,308);
        
        addObject(new bloquepoder(),442,230);
        addObject(new vacio(),159,230);
        addObject(new toad(),698,203);
        addObject(new plantab(),159,261);
        setPaintOrder(Dead.class,vacio.class,ground.class,mario.class,end.class,goomba.class,cloud.class,toad.class);
        //Greenfoot.playSound("ringtones-super-mario-bros.wav");
        global.variables.v=4;
        
            for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int i=5;i<11;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
             for(int i=13;i<19;i++)
            {
                addObject(new ground(),i*30+10,150);
            }
             for(int i=22;i<26;i++)
            {
                addObject(new empty(),i*30+40,80);
            }
            addObject(new koopa(),477,120);
            addObject(new koopa(),152,198);
            addObject(new bush(),245,194);
            addObject(new bush(),268,304);
            addObject(new bush(),557,304);
            addObject(new coin(),772,300);
            addObject(new bush(),517,115);
            addObject(new goomba(),446,310);
            addObject(new goomba(),389,119);
            addObject(new tubo(2),789,39);
            addObject(new hongo(),700,291);
    }
    public void act()
    {
        if(global.variables.j==2)
        Greenfoot.setWorld(new World3());
        showText("Score: "+global.variables.pts,80,30);
        showText("Toads: "+global.variables.toads,180,30);
    }
}
