/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramsToDo;
import java.util.HashMap;
/**
 *
 * @author Aditya
 */
public class MajorityElement {
    public static void findElement(int arr[],int len){
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i =0;i<len;i++){
            if(hash.containsKey(arr[i])){
                int count = hash.get(arr[i])+1;
                if(count>=arr.length/2){
                    System.out.println("Majority found and value is "+ arr[i]);
                    return;
                }
                else
                    hash.put(arr[i], count);
              
            }
            else{
                hash.put(arr[i],1);
            } 
             
        }
        System.out.println("None in majority");
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,2,2,2,4,5,5,6};
        int len = arr.length;
        findElement(arr,len);
    }
    
}
