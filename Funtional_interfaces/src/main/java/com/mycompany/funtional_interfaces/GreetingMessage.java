/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funtional_interfaces;

/**
 *
 * @author shak_
 */
@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
    
    // Using @FunctionalInterface is not possible to declare another method inside this interface, also, is mandatory to declare one abstrac method
}
