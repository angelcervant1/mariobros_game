import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class koopaDead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koopaDead extends Actor
{
    int v=5;
    double speed=2,g=8;
    int actos=20;
    public void act() 
    {
        move(v);
        if((isAtEdge()||isTouching(empty.class)||isTouching(bloquepoder.class)||isTouching(tubo.class)||isTouching(vacio.class)))
        v*=-1;
        checkFall();
        delete();
        if(isTouching(koopaDead.class)||isTouching(jefe.class))
        {
            removeTouching(koopaDead.class);
            global.variables.pts+=100;
            Greenfoot.playSound("smb_kick.wav");
            getWorld().removeObject(this);
        }
        else
        {
        if(underMario())
        {
            Greenfoot.playSound("smb_kick.wav");
        if(v==0)
        {
        v=5;
        if(right()||left())
        {
            removeTouching(mario.class);
            getWorld().addObject(new end(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().addObject(new Dead(),getX(),getY());
            Greenfoot.playSound("mario-bros game over.wav");
        }
    }
        else
        v=0;
        
    }
}
    }
    public void delete()
    {
        if(isTouching(koopa.class))
        {
            removeTouching(koopa.class);
            global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
        else
        {
         if(isTouching(goomba.class))
        {
            removeTouching(goomba.class);
            global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
        else
        if(isTouching(pinchi.class))
        {
            removeTouching(pinchi.class);
            global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
    
    }
    }
    public void checkFall()
    {
        if(onGround())
        {
            speed=0;
            g=7.5;
        }
        else 
        fall();
    }
    public boolean onGround()
    {
        Actor under=getOneObjectAtOffset(0,16,ground.class);
        return under!=null;
    }
    public boolean left()
    {
        Actor d=getOneObjectAtOffset(-15,0,mario.class);
        return d!=null;
    }
    public boolean right()
    {
        Actor aw=getOneObjectAtOffset(15,0,mario.class);
        return aw!=null;
    }
    public boolean underMario()
    {
        Actor abao=getOneObjectAtOffset(0,-15,mario.class);
        return abao!=null;
    }
    public void fall()
    {
       setLocation(getX(),(int)(getY()+speed));
       speed+=0.159; 
       g-=0.1; 
    }
}
