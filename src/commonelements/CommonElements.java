/*
 * Write a program to identify common elements or numbers between
 * two given arrays. 
 */
package commonelements;

import java.util.ArrayList;
import java.util.List;

public class CommonElements
{
    public static void main(String[] args) 
    {
       int[]arr1 = {2, 4, 6, 8, 10};
       int[]arr2 = {1, 2, 3, 4, 5};
       
       for(int i = 0; i< arr1.length; i++)
       {
           for(int j = 0; j < arr2.length; j++)
           {
               //if the elements match in the arrays
               if(arr1[i] == arr2[j])
               {
                    System.out.println(arr1[i]);
               }
           }
       }
    }
    
}
