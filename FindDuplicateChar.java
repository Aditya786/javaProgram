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
public class FindDuplicateChar {
    public static void main(String[] args) {
        String str = "GGGGGGGGGGGGGGreat responsibility";
        str=str.toLowerCase();
        char c[] = str.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=0){
                int count=0;
                for(int j=i+1;j<c.length;j++){
                    if(c[i]==c[j]){
                        count++;
                        if(count==1){
                            System.out.println(c[i]);
                        }
                        c[j]=0;
                    }
                    
                }
            }
        }
    }
    
}
