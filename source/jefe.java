import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jefe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jefe extends Actor
{
    int n=1;
    int actos=8;
    int v=Greenfoot.getRandomNumber(5)+5;
    int prob;
     lifeBarTecno vida;
    Boss mundo;
    int mom=50,mome=100,ram;
    protected void addedToWorld(World x)
    {
    mundo=(Boss)getWorld();
    }
    public void act() 
    {
        if(mom==0)
        {
            ram=Greenfoot.getRandomNumber(2)+1;
            getWorld().addObject(new ataque(ram),getX(),getY());
            mom=30;
        }
        mom--;
        if(mome==0)
        {
            getWorld().addObject(new koopa(),getX(),getY());
            mom=40;
        }
        mome--;
        if(actos==0)
        {
            setImage("boss"+n+".png");
    
            if(n==3)
            n=1;
            else
            n++;
            actos=8;
        }
        actos--;
        move(v);
        if(prob==0||isAtEdge())
        {
            v*=-1;
            prob=Greenfoot.getRandomNumber(50)+20;
        }
        prob--;
        if(mundo.vida.life()==0)
        {
            Greenfoot.playSound("smb_bowserfalls.wav");
            Greenfoot.playSound("smb_stage_clear.wav");
            global.variables.tiemposboss=-2;
            getWorld().addObject(new tubo(0),getX(),getY()+5);
            getWorld().addObject(new vacio(),getX()-40,getY()-20);
            //getWorld().addObject(new planta(),getX()-40,getY()-40);
            getWorld().addObject(new vacio(),getX()-40,getY()+10);
            getWorld().addObject(new vacio(),getX()+40,getY()-20);
            //getWorld().addObject(new planta(),getX()+40,getY()-40);
            getWorld().addObject(new vacio(),getX()+40,getY()+10);
            getWorld() .showText("¡Victoria!",getX(),getY()-50);
            getWorld().removeObject(this);
        }
    }    
}

