/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.drawabletest;
/**
 *
 * @author hp
 */
public class DrawableTest {

    public static void main(String[] args) {
        int size=Integer.parseInt(args[0]);
        if(size<2)
        {
            System.out.println("Invalid size input");
            return;
        }
        
        Drawable[] array=new Drawable[size];
        double Areas=0;
        
        for(int i=0;i<size;i++)
        {
            String shape=args[1+(i*2)];
            double dimension=Double.parseDouble(args[2+(i*2)]);
            
            if(shape.equalsIgnoreCase("circle"))
                array[i]=new Circle("Any color",dimension);
            
            else if(shape.equalsIgnoreCase("cube"))
                array[i]=new Cube("Any color",dimension);
            
            else
                System.out.println("Uknown shape");
            
            Areas +=array[i].getArea();
        }
        
        System.out.println("Sum of Areas= "+Areas);
}
}
