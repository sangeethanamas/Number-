/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arrangenumbers;

import java.util.Scanner;

/**
 *
 * @author hp1
 */
public class Array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int arr[]=new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        String stroutput =String.valueOf(arr[0]);
         for(int icounter=1;icounter<arr.length;icounter++)
         {
             if(arr[icounter]-arr[icounter-1]==1)
             {
                 //stroutput= stroutput +"-"+ String.valueOf(arr[icounter])+",";   
                 if((icounter<arr.length)&&(arr[icounter+1]-arr[icounter]!=1))
                 {
                     stroutput = stroutput + "-" +String.valueOf(arr[icounter]);
                 }
             }
                 else
             {
                 stroutput= stroutput+"," +String.valueOf(arr[icounter]);
                 //System.out.println(stroutput);
             }
         }
         System.out.println(stroutput);     
} 
}





