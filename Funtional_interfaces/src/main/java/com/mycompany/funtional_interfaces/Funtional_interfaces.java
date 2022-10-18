/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funtional_interfaces;

/**
 *
 * @author shak_
 */
public class Funtional_interfaces {

    public static void main(String[] args) {
        
        GreetingMessage gm = new GreetingMessage(){
            @Override
            public void greet(String name){
                System.out.println("Hello "+ name);
            }
        };
        gm.greet("Luis");
        
         GreetingMessage gm2 = (String name) -> {
                System.out.println("Hello "+ name);             
         };
         gm2.greet("Manuel");
         
         MessagePrinter mp = () -> {
             System.out.println("This is a message");
         };
         mp.printMessage();
    }
}
