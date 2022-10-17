/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author shak_
 */
public class LinkedHashMapExample {

     public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap(4, 0.75f, true);
        //Los tres parametros del constructor representan la capacidad inicial del LinkedHashMap, en que porcentaje vamos a hacer crecer el LinkedHashMap
        // y el orden de acceso.
        // Si el orden de acceso esta seteado a false entonces mantendrá el orden en el cual hemos introducido los contactos
        // Si el orden de acceso esta setado a true entonces cuando accedamos a uno de los contactos este se situará al final del LinkedHashMap
        
        phoneBook.put("Kevin", 568168);
        phoneBook.put("Luis", 80889998);
        phoneBook.put("Maria", 45989143);
        phoneBook.put("Samuel", 984651);
        phoneBook.put("Murcial", 1557);
        
        System.out.println("Kevin's number: " + phoneBook.get("Kevin"));
        
        for(Map.Entry<String, Integer> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
     }
}
