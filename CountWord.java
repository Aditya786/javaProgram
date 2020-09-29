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
public class CountWord {
    public static void main(String[] args) {
        String str = "Hello how are you' and your family";
        int count=0;
        /*String strWord[];
        strWord=str.split(" ");
        
        System.out.println("The number of words are "+strWord.length);*/
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && Character.isLetter(str.charAt(i+1)) && i>0){
                count++;
            }
        }
        System.out.println(count+1);
    }
    
}
