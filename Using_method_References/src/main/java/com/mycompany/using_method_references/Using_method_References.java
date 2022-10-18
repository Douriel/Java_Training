/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.using_method_references;

/**
 *
 * @author shak_
 */
public class Using_method_References {

    public static void main(String[] args) {
        Square s = new Square(4);
        
        Shapes shapes = Square::calculateArea;
        
        System.out.println("Area: " + shapes.getArea(s));
        //Not useful 
    }
}
