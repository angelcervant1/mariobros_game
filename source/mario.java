import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class mario extends Actor
{
    boolean band;
    double speed=1.5,g=8;
    int n=1,x=1,v=4;
    int actos=5;
    int prob;
    boolean bandera=true;
     public void act() 
     {  
         if(underBlock())
         {
             g=0;
            if(bandera==true)
            Greenfoot.playSound("smb_bump.wav");
            bandera=false;
             vacio xdd=new vacio();
             bloquepoder ds=(bloquepoder)getOneIntersectingObject(bloquepoder.class);
             prob=Greenfoot.getRandomNumber(4)+1;
             Greenfoot.playSound("smb_powerup_appears.wav");
             getWorld().addObject(new vacio(),ds.getX(),ds.getY());
             if(prob==1)
             getWorld().addObject(new star(),ds.getX(),ds.getY()-35);
             else
             getWorld().addObject(new coin(),ds.getX(),ds.getY()-35);
             removeTouching(bloquepoder.class);
            }
            else
          if(underBrick()||underEmpty()||underVacio())
        {
            g=0;
            if(bandera==true)
            Greenfoot.playSound("smb_bump.wav");
            bandera=false;
        }
         
           if(getOneObjectAtOffset(-80,0,castillo.class)!=null) 
           {
           Greenfoot.stop();
           getWorld().showText("Score: "+global.variables.pts,400,140);
           getWorld().showText("Toads: "+global.variables.pts,400,180);
           getWorld().showText("¡Has rescatado a la princesa!",400,220);
           Greenfoot.playSound("smb_world_clear.wav");
        }
        
        jump();
        checkFall();
        checkCollision();
        
            if(isTouching(tubo.class)&&global.variables.j==-1)
            Greenfoot.playSound("mario-bros-here-we-go-hoo.wav");
           
    
         if(isTouching(coin.class))
         {removeTouching(coin.class);
            global.variables.pts+=50;
         Greenfoot.playSound("smb_coin.wav");}
        
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
        
        if(onKoopa()||onKoopaDead())
        {
            
            if(onKoopa())
            {
            koopa abroso;
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
             abroso=(koopa)getOneIntersectingObject(koopa.class);
             jump();
             setLocation(getX(),(int)(getY()-10));
             speed=-3;
             getWorld().addObject(new koopaDead(),abroso.getX(),abroso.getY());
             removeTouching(koopa.class);
            global.variables.pts+=50;
            }
            if(onKoopaDead())
            {
                Greenfoot.playSound("smb_kick.wav");
                 koopaDead ssabroso;
             ssabroso=(koopaDead)getOneIntersectingObject(koopaDead.class);
             jump();
             setLocation(getX(),(int)(getY()-8));
             speed=-2;
            }
            
        }
        else
        
        if(onGoomba())
        {
            Greenfoot.playSound("mario-mario-touch-enemy.wav");
            
            global.variables.pts+=50;
            goomba sabroso;
             sabroso=(goomba)getOneIntersectingObject(goomba.class);
              setLocation(getX(),(int)(getY()-5));
             speed=-2;
             getWorld().addObject(new goombaDead(),sabroso.getX(),sabroso.getY());
             removeTouching(goomba.class);
        }
        
        
         
         
        right();
        left();
        if(isTouching(koopa.class)&&onGround()||isTouching(ataque.class)||isTouching(cañon.class)||isTouching(goomba.class)&&onGround())
        {
            playDead();
            
        }
        else
        {
        if(isTouching(planta.class)||isTouching(jefe.class)||isTouching(pinchi.class)||isTouching(plantab.class))
            playDead();
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
     public void playDead()
     {
         getWorld().addObject(new end(),getWorld().getWidth()/2,getWorld().getHeight()/2);
         getWorld().addObject(new Dead(),getX(),getY());
            Greenfoot.playSound("smb_mariodie.wav");
            getWorld().removeObject(this);
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
    
    public boolean onGround()
    {
        Actor under=getOneObjectAtOffset(0,17,ground.class);
        return under!=null;
    }
    public boolean onVacio()
    {
        Actor underd=getOneObjectAtOffset(0,18,vacio.class);
        return underd!=null;
    }
    public boolean underBlock()
    {
        Actor b=getOneObjectAtOffset(0,-15,bloquepoder.class);
        return b!=null;
    }
    public boolean underVacio()
    {
        Actor down=getOneObjectAtOffset(0,-18,vacio.class);
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
        Actor dead=getOneObjectAtOffset(0,10,koopa.class);
        return dead!=null;
    }
    public boolean underEmpty()
    {
        Actor dead=getOneObjectAtOffset(0,-18,empty.class);
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
    public boolean onKoopaDead()
    {
        Actor t=getOneObjectAtOffset(0,10,koopaDead.class);
        return t!=null;
    }
    public boolean underBrick()
    {
        Actor debajo=getOneObjectAtOffset(0,-18,ground.class);
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
            bandera=true;
            if(x==n)
            setImage("Mario"+".png");
            else
            setImage("mizq"+".png");
        }
        else 
        fall();
        
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
        
            setLocation(getX()+v,getY());
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
        
        setLocation(getX()-v,getY());
        }
      
    }
}
