import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class placa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class placa extends Actor
{
    lifeBarTecno vida;
    boolean band=true;
    Boss mundo;
    protected void addedToWorld(World x)
    {
    mundo=(Boss)getWorld();
    }
    public void act() 
    {
        if(underMario())
        {
            setImage("P2"+".png");
            if(band==true)
            {
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
            mundo.vida.decrementar(50);
        }
            band=false;
        }
    }    
    public boolean underMario()
    {
        Actor abao=getOneObjectAtOffset(0,-10,mario.class);
        return abao!=null;
    }
}
