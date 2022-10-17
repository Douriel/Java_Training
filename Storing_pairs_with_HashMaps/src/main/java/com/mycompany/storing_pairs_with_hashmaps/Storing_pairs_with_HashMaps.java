/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.storing_pairs_with_hashmaps;

import java.util.HashMap;

/**
 *
 * @author shak_
 */
public class Storing_pairs_with_HashMaps {

    public static void main(String[] args) {
        
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 568168);
        phoneBook.put("Luis", 80889998);
        phoneBook.put("Maria", 45989143);
        phoneBook.put("Samuel", 984651);
        phoneBook.put("Murcial", 1557);
        phoneBook.put("Murcial", 2222);
        phoneBook.put(null, 000);
        
        //Podemos ver que el HashMap no mantiene el orden de los elementos que hemos añadido
        // Tambien podemos observar que el nombre de Murcial sobrescribe el primer Murcial, y por lo tanto no hay dos contactos con el mismo nombre
        // esto se debe a que la Key es el nombre 
        
        if(phoneBook.containsKey("Maria")){
            phoneBook.remove("Maria");
        }
        
        System.out.println(phoneBook);
        
        phoneBook.clear();
    }
}
