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
public class Disarium {

    /**
     * @param args the command line arguments
     */
    public static int numberOfDigit(int number){
        int length=0;
        while(number!=0){
            length=length+1;
            number/=10;
        }
        return length;
    }
    
    public static void main(String[] args) {
        int num=175,sum=0,rem,len;
        len=numberOfDigit(num);
        int n=num;
        
        while(num!=0){
            rem=num%10;
            sum=sum+ (int)Math.pow(rem, len);
            num/=10;
            len--;
        }
    if(sum==n){
        System.out.println("175 is disarium number");
    }
    else    
            System.out.println("175 is not disarium number");
    }
    
}
