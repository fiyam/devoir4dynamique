/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import static javaapplication11.JavaApplication11.combinations;


public class  main {
         public static void main(String[] args) {
                List<int[]> list = new ArrayList<>();
                int[] A = null ;
             
                for(int m=1 ; m<=3 ; m++ )
                A = IntStream.rangeClosed(0, m).toArray();
                
                
                  int numArrays = (int)Math.pow(arr.length, n);
                    System.out.println(numArrays);
                   // Create each array
                   for(int i = 0; i < numArrays; i++) {
                       list.add(new int[n]);  
                   } 
                   // Fill up the arrays
                   for(int j = 0; j < n; j++) {
                       // This is the period with which this position changes, i.e.
                       // a period of 5 means the value changes every 5th array
                       int period = (int) Math.pow(arr.length, n - j - 1);
                       for(int i = 0; i < numArrays; i++) {
                           int[] current = list.get(i);
                           // Get the correct item and set it
                           int index = i / period % arr.length;
                           current[j] = arr[index];
                       }
                   }
                
                
                
                
                
               // combinations(2 , A , list);
         }
}
