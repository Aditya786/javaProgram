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
public class FindDuplicateWord {
    public static void main(String[] args) {
        String str = "big black bug bit a big black dog on his big black nose";
        str=str.toLowerCase();
        String []s = str.split(" ");
        for(int i=0;i<s.length-1;i++){
            int count=0;
            if(s[i]!=" "){
            for(int j=i+1;j<s.length;j++){
                if(s[i].equals(s[j])){
                    count++;
                    if(count==1){
                            System.out.println(s[i]);
                        }
                    s[j]=" ";
                }
            }
            }
        }
    }
    
    
}
