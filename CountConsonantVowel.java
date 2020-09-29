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
public class CountConsonantVowel {
    public static void main(String[] args) {
        int cVow=0,cCon=0;
        String str = "Hello how are you adityaBBBB";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                cVow++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                cCon++;
            }
        }
        System.out.println("Number of vowels "+cVow);
        System.out.println("Number of vowels "+cCon);
    }
    
}
