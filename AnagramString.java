/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberCodingInterview;
import java.util.Arrays;
/**
 *
 * @author Aditya
 */
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "gRab";
        String str2 = "barG";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        if(str1.length()!=str2.length()){
            System.out.println("String are not anagram");
        }
        else{
            char []char1=str1.toCharArray();
            char []char2=str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1, char2)){
                System.out.println("String is anagram");
            }
            else
                System.out.println("String is not anagram");
        }
        
        
    }
    
}
