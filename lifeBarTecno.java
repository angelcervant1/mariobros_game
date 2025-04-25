import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class lifeBarTecno extends Actor
{
        private GreenfootImage bg;
    private GreenfootImage skin;
    private GreenfootImage bar;
    private int lifes,limite;
    private double inc,max=296.0;
    //private Color bgColor=new Color(63,38,17,245);
    private Color bgColor=new Color(50,0,0,245);
    private Color color=new Color(240,145,85);
    public lifeBarTecno(int v)
    {
        bg=new GreenfootImage(300,47);
        skin=new GreenfootImage("lifeBarWood.png");
        bar=new GreenfootImage((int)max,17);
        limite=v;
        lifes=v;
        inc=(max/limite);
        dibuja();
    }
    private void dibuja()
    {
        bg.clear();
        bar.clear();
        
        int w=(int)(lifes*inc);
        bar.setColor(bgColor);
        bar.fillRect(0,0,(int)max,17);
        bar.setColor(color);
        bar.fillRect(0,0,w,17);
        bg.drawImage(bar,2,13);
        bg.drawImage(skin,0,0);
        setImage(bg);
    }
    public void decrementar(int n)
    {
      lifes-=n;
      if(lifes<0)lifes=0;
      dibuja();
    }
    public int life()
    {
        return lifes;
    }
    public void incrementar(int n)
    {
      lifes+=n;  
      if(lifes>=max)lifes=limite;
      dibuja();
    }
    public void backGround(int r,int g,int b)
    {
        bgColor=new Color(r,g,b);
        dibuja();
    }
    public void foreColor(int r,int g,int b)
    {
        color=new Color(r,g,b);
        dibuja();
    }

}
