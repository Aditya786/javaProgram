/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringCodingInterview;

/**
 *
 * @author Aditya
 */
public class PronicNumber {
    public static void main(String[] args) {
        int num=72,product;
        for(int i=1;i<=(num+1)/2;i++){
            product=i*(i-1);
            if(product==num){
                System.out.println("Pronic number is "+i+" * "+(i-1));
            }
        }
    }
    
    
}
