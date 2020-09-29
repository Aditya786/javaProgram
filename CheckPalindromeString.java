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
public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "kayak";
        int count=0;
        boolean flag=true;
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {
           if(str.charAt(i)!=str.charAt(str.length()-i-1))
           { 
               flag=false;
                break;
           }
        }
        if(flag)
        System.out.println("String is palindrome");
        else 
            System.out.println("Sting is not palindrome");
    }
    
}
