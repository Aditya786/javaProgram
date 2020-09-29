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
public class CountThePunctuation {
    public static void main(String[] args) {
        String str = "Hello! ho\\w are you";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-'  
                   ||  str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println(count);
    
    }
}
