import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ataque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ataque extends Actor
{
    int ran=4,rand=5,actos=60;
    public ataque(int n)
    {
        setImage("Firework"+n+".png");
    }
    public void act() 
    {
         setLocation(getX()-ran,getY()-rand);
        if(isAtEdge())
        {
            ran*=-1; 
                }
                if(underGround())
                rand*=-1;
         if(actos==0)
         {
             getWorld().removeObject(this);
             actos=60;
            }
            actos--;
       
    }    
    public boolean underGround()
    {
        Actor under=getOneObjectAtOffset(0,-10,ground.class);
        return under!=null;
    }
}
