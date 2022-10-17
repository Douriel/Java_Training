/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.implement_queue_with_linkedlist;

import java.util.LinkedList;

/**
 *
 * @author shak_
 */
public class Implement_Queue_with_linkedList {

    public static void main(String[] args) {
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Raul"));
        queue.add(new Customer("Palm"));
        queue.add(new Customer("Archiel"));
        queue.add(new Customer("Manuel"));
        
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
             
    }
    
    static void serveCustomer(LinkedList<Customer> queue){
        
        Customer c = queue.poll();
        c.serve();
    }
}
