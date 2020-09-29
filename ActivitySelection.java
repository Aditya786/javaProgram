/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyCodingInterview;
import java.util.*;
/**
 *
 * @author Aditya
 */
public class ActivitySelection {
    public static void displayActivitySelection(int s[],int f[], int len){
        //Arrays.sort(f);
        //Arrays.sort(s);
        int i=0;
        System.out.println(s[i]);
       
        for(int j=1;j<len;j++){
            if(s[j]>=f[i]){
                System.out.println(s[j]);
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        int []s={1, 3, 0, 5, 8, 5};
        int []f={2, 4, 6, 7, 9, 9};//finish time is already sort
        
        int len=s.length;
        displayActivitySelection(s,f,len);
        
                
    }
}
