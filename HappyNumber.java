/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberCodingInterview;

/**
 *
 * @author Aditya
 */

public class HappyNumber {
    public static int isHappyNumber(int num){
        int sum=0 ,rem=0;
        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem);
            num/=10;
        }
        return sum;
    }
    
    public static void happyNumber(int num){
        int result=num;
        while(result!=1&&result!=4){
            result=isHappyNumber(result);
        }
        if(result==1){
            System.out.println(num+" is happy number");
        }
        
    }
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            happyNumber(i);
        }
            
        
    }
    
}
