/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawabletest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FileTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file=new File("input.txt");
        Scanner input=new Scanner(file);
        
        int size=input.nextInt();
        Drawable []array=new Drawable[size];
        double Areas=0;
        
        for(int i=0;i<size;i++)
        {
            String shape=input.next();
            double dimension=input.nextDouble();
            if(shape.equalsIgnoreCase("Circle"))
                array[i]=new Circle("any color",dimension);
            else if(shape.equalsIgnoreCase("Cube"))
                array[i]=new Cube("any color",dimension);
            else
                System.out.println("Unknown shape");
            Areas +=array[i].getArea();
        }
        input.close();
        
        BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
        bw.write("Sum of Areas= "+Areas);
        bw.close();
    }
}
