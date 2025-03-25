/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawabletest;

import java.util.Date;

/**
 *
 * @author hp
 */
public abstract class Shape implements Drawable{
    private Date dateCreated;
    private String color;
    
    public Shape()
    {
       dateCreated=new Date();
       color="Uknown";
    }
    
    public Shape(String color)
    {
        this.dateCreated=new Date();
        this.color=color;
    }
    public  Date getDateCreated()
    {
        return dateCreated;
    }
    
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public abstract double getArea();  
    public abstract double getPerimeter();
    
    @Override
    public  abstract String howToDraw();

    @Override
    public String toString()
    {
        return "Shape{" + "dateCreated=" + dateCreated + ", color=" + color + '}';
    }
}
