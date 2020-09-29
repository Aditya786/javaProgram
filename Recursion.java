/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Aditya
 */
public class Recursion {
    public static void main(String[] args) {
        int x=5;
        fact(x);
    }
    public static void fact(int x){
        if(x<=0)
            return;
        fact(x-1);    
        System.out.println(x);
        
    }
}
