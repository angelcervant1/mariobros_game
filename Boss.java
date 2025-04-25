import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends World
{
    lifeBarTecno vida=new lifeBarTecno(150);
    public Boss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 385, 1); 
        global.variables.tiemposboss=0;
        addObject(new mario(),28,308);
        setPaintOrder(lifeBarTecno.class,Dead.class,mario.class,end.class,calavera.class,vacio.class,ground.class,cañon.class,goomba.class,cloud.class,toad.class,hongo.class);
        for(int c=0;c<27;c++)
            {
                addObject(new ground(),c*30+10,340);
            }
            for(int c=0;c<6;c++)
            {
                addObject(new ground(),c*30+10,200);
            }
            for(int c=10;c<14;c++)
            {
                addObject(new ground(),c*30+10,100);
            }
             for(int c=20;c<24;c++)
            {
                addObject(new ground(),c*30+10,200);
            }
            addObject(new jefe(),600,300);
            addObject(vida,642,25);
            addObject(new placa(),350,69);
            addObject(new placa(),32,169);
            addObject(new placa(),640,169);
            addObject(new calavera(),640,200);
            addObject(new vacio(),640,200);
            addObject(new calavera(),32,200);
            addObject(new vacio(),32,200);
            addObject(new calavera(),350,100);
            addObject(new vacio(),350,100);
            addObject(new cloud(),358,204);
            addObject(new koopa(),288,309);
    }
    public void act()
    {
        if(global.variables.j==6)
        Greenfoot.setWorld(new Victoria());
        if(global.variables.tiemposboss==0)
        {
            global.variables.tiempos=-2;
            Greenfoot.playSound("mario-castle-bros.wav");
            global.variables.tiemposboss=370;
            global.variables.copia=global.variables.tiemposboss;
        }
        global.variables.tiemposboss--;
        showText("Vida De Bowser",700,22);
            
    }
}
