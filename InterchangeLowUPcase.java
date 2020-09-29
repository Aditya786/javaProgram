/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringCodingInterview;

//import static java.lang.Character.isLowerCase;

/**
 *
 * @author Aditya
 */
public class InterchangeLowUPcase {
    public static void main(String[] args) {
        String s = "Hello How are you";
        StringBuffer newstr = new StringBuffer(s);
            for(int i=0;i<s.length();i++){
                if(Character.isLowerCase(s.charAt(i))){
                    newstr.setCharAt(i,Character.toUpperCase(s.charAt(i)) );
                }
                if(Character.isUpperCase(s.charAt(i))){
                    newstr.setCharAt(i,Character.toLowerCase(s.charAt(i)) );
                }
            }
            System.out.println(""+newstr);
       
    }
    
}
