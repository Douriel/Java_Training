/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author shak_
 */
public class Project_2 {

    static Character[] charArray = {'L','u','i','s'};
    static Integer[] intArray = {1,2,3,5};
    static Boolean[] boolArray = {true, false, true};
    
    public static List arrayToList(Object[] array, List<Object> list){
        for (Object object : array){
            list.add(object);
        }
        return list;
    }

    


    public static void main(String[] args) {
        
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
    }
}
