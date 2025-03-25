/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawabletest;

/**
 *
 * @author hp
 */
public class Cube extends ThreeDShape{
    private double side;
    public Cube(double side)
    {
        this.side=side;
    }
    
    public Cube(String color,double side)
    {
        super(color);
        this.side=side;
    }
    
    public double getSide()
    {
        return side;
    }
    
    public void setSide(double side)
    {
        this.side=side;
    }
    
    @Override
        public double getVolume()
        {
            double Volume=Math.pow(side, 3);
            return Volume;
        }
        
    @Override
        public double getArea()
        {
            double SurfaceArea=6*side*side;
            return SurfaceArea;
        }
        
    @Override
        public double getPerimeter()
        {
            double Perimeter=12*side;
            return Perimeter;
        }
        
   @Override
        public String howToDraw()
        {
            return "Draw a cube with side legth "+side;
        }
        
   @Override
       public String toString()
       {
           return "Cube [Side = "+side +", color is "+getColor() +" Volume = "+getVolume() +",Surface Arera= "
                   +getArea() +", Perimeter= "+getPerimeter()+']';
       }
}
