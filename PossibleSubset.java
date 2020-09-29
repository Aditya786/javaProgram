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
public class PossibleSubset {
    public static void main(String[] args) {
        String str = "abc";
        int temp=0;
        String arr[] = new String[str.length()*(str.length()+1)/2];
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                arr[temp]=str.substring(i,j+1);
                temp++;
                
            }
        }
         System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);  
        }  
    }
}
