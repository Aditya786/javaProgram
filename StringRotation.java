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
public class StringRotation {
    public static void main(String[] args) {  
        String str1 = "abcde", str2 = "deabc";  
          
        if(str1.length() != str2.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            //Concatenate str1 with str1 and store it in str1  
            str1 = str1.concat(str1);  
              
            //Check whether str2 is present in str1  
            if(str1.indexOf(str2) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  
    }  
    
}
