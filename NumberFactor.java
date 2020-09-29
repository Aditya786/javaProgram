/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyCodingInterview;

/**
 *
 * @author Aditya
 */
public class NumberFactor {
   

	public int waysToGetN(int n) {
            if( (n==0) || (n==1) || (n==2)){
                return 1;
            }
            if( (n==3)){
                return 2;
            }
            int substract1 = waysToGetN(n-1);
            int substract2 = waysToGetN(n-3);
            int substract3 = waysToGetN(n-4);
            return substract1+substract2+substract3;
		
	}

	
	public static void main(String[] args) {
		NumberFactor nf = new NumberFactor();
                System.out.println(nf.waysToGetN(4));
                System.out.println(nf.waysToGetN(5));
                System.out.println(nf.waysToGetN(6));
                
	}
	
	

}
