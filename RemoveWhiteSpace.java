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
public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Remove the whitespace";
        char []chars=str.toCharArray();
        int len = chars.length;
        for(int i=0;i<len;i++){
            if(chars[i]==' '){
                for(int j=i;j<len;j++){
                    chars[j]=chars[j+1];
                }
                len--;
            }
        }
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
