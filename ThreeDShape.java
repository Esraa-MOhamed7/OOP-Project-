/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawabletest;

/**
 *
 * @author hp
 */
public abstract class ThreeDShape extends Shape{
    public ThreeDShape()
    {
        
    }
    
    public ThreeDShape(String color)
    {
        super(color);
    }
    
    public abstract  double getVolume();
    
    @Override
        public abstract double getArea();
        
    @Override
        public abstract double getPerimeter();

    
    @Override
        public  abstract String howToDraw();

    @Override
    public String toString()
    {
        return "ThreeDShape , color= "+getColor();
    }
}
