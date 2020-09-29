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
public class DivideStringEqually {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        int n=3;
        int len = str.length();
        int chars=len/n;
        int temp=0;
        String []equalStr = new String[chars];//string array of size char so that it equal store all values
        if(len%n!=0){//checking can we make the parts?
            System.out.println("Can't divide into equal parts ");
        }
        else{
            for(int i=0;i<len;i=chars+i){//loop is running for 3 times
                String part = str.substring(i,i+chars);
                equalStr[temp]=part;
                temp++;
            }
        
        }
        System.out.println("equal part of given string ");
        for(int i=0;i<equalStr.length;i++){
            System.out.println(equalStr[i]);
        
        }
    }
}
