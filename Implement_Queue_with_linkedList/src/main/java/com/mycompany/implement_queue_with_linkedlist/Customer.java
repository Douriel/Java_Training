/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.implement_queue_with_linkedlist;

/**
 *
 * @author shak_
 */

public class Customer {
    String name;
    Boolean haveBeenServed;
    
    Customer(String name){
        this.name = name;
        this.haveBeenServed = false;
    }
    
    public void serve(){
        haveBeenServed = true;
        System.out.println(name + " Have been served");
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
