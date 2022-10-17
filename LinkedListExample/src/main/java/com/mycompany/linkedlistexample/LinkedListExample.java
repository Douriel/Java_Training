/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author shak_
 */
public class LinkedListExample {

    public static void main(String[] args) {
        
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);
        
        // ArrayList es versatil y puede ser utilizado siempre en caso de duda,ç
        // no obstante, LinkedList la cual tambien implementa la interfaz List
        // esta más especializada en añadir y eliminar elementos.
        
        // LinkedList es la mejor opcion en estos casos
        
    }
}
