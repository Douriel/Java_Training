/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_3;

/**
 *
 * @author shak_
 */
public class Project_3 {

    public static void main(String[] args) {
        String item1 = "banana";
        String item2 = "mustard";
        
        String[] items = {item1, item2, "rice"};
        
        printShoppingList(item1, item2);
        System.out.println();
        printShoppingList(items);
    }
    

    
        private static void printShoppingList(String... items){
        System.out.println("SHOPPING LIST");
        for(String i: items){
            System.out.println(i);
        }
    }
}
