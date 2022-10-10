/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author shak_
 */
public class Mavenproject1 {

    // Simplemente esto es una prueba para ver la diferencia entre un GENERIC TYPE  
    // y un no GENERIC.
    
    /* 
        Podemos obervar que en el primer List, en el cual no declaro que se trata
        de un List de Strings, no puedo guardar en una variable String el primer nombre
        ya que es tratado como un objeto.
    */
    
    public static void main(String[] args) {
        
        List names = new ArrayList();
        names.add("kelly");
        //String name = names.get(0);
        
        List<String> names2 = new ArrayList();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println("This is my name: "+name2);
        
        
    }
}
