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
public class NewClass {
    public static void main(String[] args) {
        String str = "adiytabaghel";
        char s[]=str.toCharArray();
        int len = s.length;
        int arr[] = new int[len];
        int index=0;
        for(int i=0 ; i<len ; i++){
            int count=1;
                for(int j=i+1 ; j<len ; j++){
                    if(s[i]==s[j]){
                        count++;
                        s[j]=' ';
                    }
                }
                arr[index]=count;
                index++;
        }
        for(int i=0; i<len;i++){
            if(s[i]!=' '){
                System.out.println(s[i]+" "+arr[i]);
            }
        }
    }
}
