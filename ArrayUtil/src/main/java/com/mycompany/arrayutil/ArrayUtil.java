/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayutil;

/**
 *
 * @author Administrador
 */
public class ArrayUtil {
    
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void arrayDemo(){
        int[] myArray = new int[5];  //default values
        //printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 4;
        myArray[3] = 9;
        myArray[4] = 15;
        
        printArray(myArray);
        
        System.out.println(myArray.length);   //length of the array
        System.out.println(myArray[myArray.length - 1]);  //accessing the last value of array
    }
    
    public static void main(String[] args) {
        ArrayUtil arrUtil = new ArrayUtil();
        arrUtil.arrayDemo();
    }
}
