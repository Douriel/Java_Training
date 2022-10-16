/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyect_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shak_
 */ 
public class Proyect_4 {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        
        build(building);
        build(office);
        
        
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        
        build(buildings);
        
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
    }
    
    static void build(Building building){
        System.out.println("Constructing a new " + building.toString());
    }
    
    static void build(List<Building> buildings){
        for(Building i : buildings){
            System.out.println(i);
        }
    }
}
