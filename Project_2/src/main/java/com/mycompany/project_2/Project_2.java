/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shak_
 */

public class Project_2 {

    static Character[] characters = {'L', 'u', 'i', 's'};
    static Integer[] integers = {1, 2, 3, 4};
    static Boolean[] booleans = {true, false, true};

    public static List arrayToList(Object [] array, List<Object> list){
        for(Object object: array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(characters, new ArrayList<>());
        List<Integer> intList = arrayToList(integers, new ArrayList<>());
        List<Boolean> boolList = arrayToList(booleans, new ArrayList<>());

        System.out.println(charList.get(0));
        System.out.println(intList.get(0));
        System.out.println(boolList.get(0));

    }


}
