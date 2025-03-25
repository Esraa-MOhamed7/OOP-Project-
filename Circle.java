/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawabletest;

/**
 *
 * @author hp
 */
public class Circle extends Shape{
    private double radius;
    public Circle(double radius)

    {
        this.radius=radius;
    }
    
    public Circle(String color,double radius)
    {
        super(color);
        this.radius=radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    
    @Override
        public double getArea()
        {
            double Area=Math.PI*radius*radius;
            return Area;
        }
        
   @Override
       public double getPerimeter()
       {
           double Perimeter=2*Math.PI*radius;
           return Perimeter;
       }
       
   @Override
       public String howToDraw()
       {
           return"Draw a circle with radius "+radius;
       }
       
   @Override
       public String toString()
       {
           return"Circle [Radius = "+radius +", color is "+getColor()+", Area = "+getArea() +
                   ",Perimeter ="+getPerimeter() +']';
       } 
}
