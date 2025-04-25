
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class starMario extends Actor
{
    boolean band;
    double speed=1.5,g=8;
    int n=1,x=1;
    int actos=5;
     public void act() 
     {  
         
            checkCollision();
         if(isTouching(coin.class))
         {removeTouching(coin.class);
            global.variables.pts+=50;
         Greenfoot.playSound("mario-bros-coin.wav");}
        
        if(global.variables.tiempos==0)
         { 
         Greenfoot.playSound("ringtones-super-mario-bros.wav");
         global.variables.tiempos=1050;
         }
         global.variables.tiempos--;
        if(isTouching(tubo.class))
         {
             Greenfoot.playSound("mario-bros tuberia.wav");
             
             global.variables.j++;
             removeTouching(tubo.class);
            }
        jump();
        checkFall();
       
        if(underBlock())
         {
             bloquepoder bloque;
             bloque=(bloquepoder)getOneIntersectingObject(bloquepoder.class);
             getWorld().addObject(new vacio(),bloque.getX(),bloque.getY());
             getWorld().addObject(new star(),bloque.getX(),bloque.getY()-35);
             Greenfoot.playSound("mario-bros nivel completado.wav");
             removeTouching(bloquepoder.class);
            }
         
        right();
        left();
        if(isTouching(planta.class))
        {
            removeTouching(planta.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
        if(isTouching(goomba.class))
        {
            removeTouching(goomba.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
         if(isTouching(koopa.class))
        {
            removeTouching(koopa.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
        if(isTouching(koopaDead.class))
        {
            removeTouching(koopaDead.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
        }
            if(isTouching(pinchi.class)){
             removeTouching(pinchi.class);global.variables.pts+=50;
             Greenfoot.playSound("mario-mario-touch-enemy.wav");
            }
              if(isTouching(plantab.class)){
              removeTouching(plantab.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");}
              if(isTouching(cañon.class)){
              removeTouching(cañon.class);global.variables.pts+=50;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");}
            if(isTouching(toad.class))
        {
        global.variables.toads++;
        Greenfoot.playSound("mario-bros vida.wav");
            removeTouching(toad.class);
    }
     }
     public void checkCollision()
     {
         if(leftGround())
            {
                ground lkd=(ground)getOneIntersectingObject(ground.class);
                setLocation(lkd.getX()+30,getY());
            }
         if(rightGround())
            {
                ground g=(ground)getOneIntersectingObject(ground.class);
                setLocation(g.getX()-30,getY());
            }
         if(leftVacio())
         {
             vacio lkd=(vacio)getOneIntersectingObject(vacio.class);
                setLocation(lkd.getX()+30,getY());
            }
         if(rightVacio())
         {
             vacio g=(vacio)getOneIntersectingObject(vacio.class);
                setLocation(g.getX()-30,getY());
            }
             if(leftBloquepoder())
         {
             bloquepoder df=(bloquepoder)getOneIntersectingObject(bloquepoder.class);
                setLocation(df.getX()+30,getY());
            }
         if(rightBloquepoder())
         {
             bloquepoder dg=(bloquepoder)getOneIntersectingObject(bloquepoder.class);
                setLocation(dg.getX()-30,getY());
            }
               if(rightEmpty())
         {
             empty dfsa=(empty)getOneIntersectingObject(empty.class);
                setLocation(dfsa.getX()-30,getY());
            }
         if(leftEmpty())
         {
             empty sdg=(empty)getOneIntersectingObject(empty.class);
                setLocation(sdg.getX()+30,getY());
            }
        }
    public void jump()
    {
       
        if(Greenfoot.isKeyDown("space"))
        {
        setLocation(getX(),(int)(getY()-g));
        if(band==false)
        Greenfoot.playSound("mario-bros-jump.wav");
        band=true;
    }
        if(Greenfoot.isKeyDown("d"))
        setImage("Mario - Jump"+".png");
        if(Greenfoot.isKeyDown("a"))
        setImage("jumpizq"+".png");
    
    }
    public boolean leftGround()
      {
          Actor izquierda=getOneObjectAtOffset(-10,0,ground.class);
          return izquierda!=null;
        } 
         public boolean rightGround()
      {
          Actor derecha=getOneObjectAtOffset(10,0,ground.class);
          return derecha!=null;
        }
        public boolean leftEmpty()
      {
          Actor ea=getOneObjectAtOffset(-15,0,empty.class);
          return ea!=null;
        } 
         public boolean rightEmpty()
      {
          Actor f=getOneObjectAtOffset(15,0,empty.class);
          return f!=null;
        }
        public boolean leftBloquepoder()
      {
          Actor i=getOneObjectAtOffset(-10,0,bloquepoder.class);
          return i!=null;
        } 
         public boolean rightBloquepoder()
      {
          Actor d=getOneObjectAtOffset(10,0,bloquepoder.class);
          return d!=null;
        }
        public boolean leftVacio()
      {
          Actor izquierda=getOneObjectAtOffset(-10,0,vacio.class);
          return izquierda!=null;
        } 
         public boolean rightVacio()
      {
          Actor derecha=getOneObjectAtOffset(10,0,vacio.class);
          return derecha!=null;
        }
    public boolean onGround()
    {
        Actor under=getOneObjectAtOffset(0,17,ground.class);
        return under!=null;
    }
    public boolean onVacio()
    {
        Actor under=getOneObjectAtOffset(0,17,vacio.class);
        return under!=null;
    }
    public boolean underBlock()
    {
        Actor down=getOneObjectAtOffset(0,-13,bloquepoder.class);
        return down!=null;
    }
    public boolean underVacio()
    {
        Actor down=getOneObjectAtOffset(0,-13,vacio.class);
        return down!=null;
    }
    public boolean onEmpty()
    {
        Actor vacio=getOneObjectAtOffset(0,17,empty.class);
        return vacio!=null;
    }
    public boolean onMushroom()
    {
        Actor plat=getOneObjectAtOffset(0,17,hongo.class);
        return plat!=null;
    }
     public boolean onCloud()
    {
        Actor suelo=getOneObjectAtOffset(0,17,cloud.class);
        return suelo!=null;
    }
    public boolean onKoopa()
    {
        Actor dead=getOneObjectAtOffset(0,15,koopa.class);
        return dead!=null;
    }
    public boolean onBlock()
    {
        Actor power=getOneObjectAtOffset(0,13,bloquepoder.class);
        return power!=null;
    }
    public boolean onGoomba()
    {
        Actor hongo=getOneObjectAtOffset(0,10,goomba.class);
        return hongo!=null;
    }
    public boolean underBrick()
    {
        Actor debajo=getOneObjectAtOffset(0,-10,ground.class);
        return debajo!=null;
    }
    
    public void fall()
    {
       setLocation(getX(),(int)(getY()+speed));
       speed+=0.159; 
       g-=0.1;
    }
    
    public void checkFall()
    {
        if(onGround()||onCloud()||onEmpty()||onMushroom()||onBlock()||onVacio())
        {
            band=false;
            speed=0;
            g=7.5;
            if(x==n)
            setImage("Mario"+".png");
            else
            setImage("mizq"+".png");
        }
        else 
        fall();
        if(underBlock()||underBrick()||underVacio())
        {
            g=0;
        }
    }
    
    public void right()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            if(Greenfoot.isKeyDown("d")&&(onGround()||onCloud()||onMushroom()||onEmpty()||onBlock()||onVacio()))
            {
            setImage("Mario - Walk"+n+".png");
             if(n==2)
            n=1;
            else
            n++;
        }
        
            setLocation(getX()+8,getY());
        }
      
    }
    
    public void left()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            if(Greenfoot.isKeyDown("a")&&(onGround()||onCloud()||onMushroom()||onEmpty())||onBlock()||onVacio())
            {
            setImage("Mario - Reverse"+x+".png");
              if(x==2)
            x=1;
            else
            x++;
        }
        
        setLocation(getX()-8,getY());
        }
      
    }
}
