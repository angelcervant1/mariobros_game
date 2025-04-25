

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class planta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class planta extends Actor
{
    int n,actos;
    public void act() 
    {
        
        
        
        if(actos==0)
        {
            setImage("plantase"+n+".png");
            if(n==1)
            n=0;
            else
            n++;
            actos=10;
        }

        
        actos--;
    }    
    }   

