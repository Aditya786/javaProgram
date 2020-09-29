/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author Aditya
 */
public class Number_Factor_TopDown {
    public int waysToGetN(int n){
        int dp[] = new int[n+1];
        return waysToGetN_TopDown(dp,n);
    }
    public int waysToGetN_TopDown(int dp[],int n){
        if(n==0||n==1||n==2){
            return 1;
        }
        else if(n==3){
            return 2;
        }
        if(dp[n]==0){
                int substract1=waysToGetN_TopDown(dp, n-1);
                int substract2=waysToGetN_TopDown(dp, n-3);
                int substract3=waysToGetN_TopDown(dp, n-4);
                dp[n]=substract1+substract2+substract3;
                
        }
        return dp[n];
    }
    
    
    public static void main(String[] args) {
        Number_Factor_TopDown en = new Number_Factor_TopDown();
        System.out.println(en.waysToGetN(4));
        System.out.println(en.waysToGetN(5));
        System.out.println(en.waysToGetN(6));
    }
}
