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
public class TotalCharacter {
    public static void main(String[] args) {
        String str = "Hello how are you";
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }
        }
        System.out.println("The number of character are "+count);
    }
}
