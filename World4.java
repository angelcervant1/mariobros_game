
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World4 extends World
{
    mario mono=new mario();
    int n=30;
    public World4()
    
    {    
        super(800, 385, 1);
        addObject(mono,45,308);
        addObject(new cloud(),370,260);
        addObject(new cloud(),170,152);
        addObject(new toad(),35,44);
        addObject(new empty(),35,84);
        addObject(new coin(),712,188);
        addObject(new plantab(),760,110);
        setPaintOrder(Dead.class,end.class,ground.class);
            for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int i=4;i<11;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
            for(int i=20;i<25;i++)
            {
                addObject(new ground(),i*30+10,230);
            }
            for(int i=10;i<15;i++)
            {
                addObject(new ground(),i*30+10,80);
            }
              for(int i=21;i<27;i++)
            {
                addObject(new vacio(),i*30+10,80);
            }
            addObject(new koopa(),122,198);
            addObject(new koopa(),355,48);
            addObject(new goomba(),600,310);
            addObject(new vacio(),659,199);
            addObject(new vacio(),659,169);
            addObject(new planta(),658,139);
            addObject(new pinchi(),200,312);
            addObject(new hongo(),512,290);
            addObject(new bush(),200,194);
            addObject(new bush(),411,44);
            addObject(new bush(),323,304);
            addObject(new tubo(2),790,39);
            addObject(new bloquepoder(),513,130);
    }
    public void act()
    {
        if(global.variables.j==4)
        Greenfoot.setWorld(new World5());
        showText("Score: "+global.variables.pts,80,30);
        showText("Toads: "+global.variables.toads,180,30);
    }
}
