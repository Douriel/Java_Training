package com.mycompany.using_method_references;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shak_
 */
public class Square {
    int sideLenghth;
    
    public Square(int sideLenghth){
        this.sideLenghth = sideLenghth;
    }
    
    public int calculateArea(){
        return sideLenghth*sideLenghth;
    }
}
