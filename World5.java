
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World5 extends World
{
    mario mono=new mario();
    int n=30;
    public World5()
    
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1); 
        
        addObject(mono,59,183);
        addObject(new toad(),334,40);
        addObject(new cloud(),167,138);
        setPaintOrder(Dead.class,mario.class,end.class,ground.class,cañon.class,goomba.class,cloud.class,toad.class,hongo.class);//setPaintOrder(Dead.class,mario.class,end.class,goomba.class,cloud.class,toad.class,ground.class);
        //Greenfoot.playSound("ringtones-super-mario-bros.wav");
        global.variables.v=4;
        
            for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int i=8;i<11;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
             for(int i=20;i<35;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
             for(int i=10;i<15;i++)
            {
                addObject(new vacio(),i*30+19,80);
            }
            for(int i=20;i<29;i++)
            {
                addObject(new vacio(),i*30+19,110);
            }
            addObject(new koopa(),398,50);
            addObject(new pinchi(),265,202);
            addObject(new cañon(),60,130);
            addObject(new goomba(),253,310);
            addObject(new goomba(),659,199);
            addObject(new plantab(),315,111);
            addObject(new planta(),193,248);
            addObject(new hongo(),61,260);
            addObject(new empty(),194,308);
            addObject(new vacio(),194,278);
            addObject(new bloquepoder(),472,228);
            addObject(new bush(),34,305);
            addObject(new bush(),140,305);
            addObject(new bush(),332,305);
            addObject(new bush(),662,194);
            addObject(new bush(),745,305);
            addObject(new coin(),98,302);
            addObject(new coin(),650,300);
            addObject(new coin(),610,300);
            addObject(new coin(),690,300);
            addObject(new coin(),730,300);
            addObject(new coin(),770,300);
            addObject(new tubo(2),788,63);
            addObject(new calavera(),790,63);
    }
    public void act()
    {
        if(global.variables.j==5)
        Greenfoot.setWorld(new Boss());
        showText("Score: "+global.variables.pts,80,30);
        showText("Toads: "+global.variables.toads,180,30);
        showText("FINAL BOSS",700,20);
    }
}
