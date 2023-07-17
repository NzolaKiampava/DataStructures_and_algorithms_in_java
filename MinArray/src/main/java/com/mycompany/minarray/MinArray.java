/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minarray;

/**
 *
 * @author Administrador
 */
public class MinArray {
    
    public int findMinimun(int[] arr){
        //edge
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("Invalid input");
        
        int min = arr[0];  //min will hold the minimun value of array
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        return min;
    }
    
    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 9, 15, 1, 2};
        MinArray ma = new MinArray();
        System.out.println("Minimun: "+ma.findMinimun(arr));
        System.out.println("SecondMax: "+ma.findSecondMax(arr));
    }
}
