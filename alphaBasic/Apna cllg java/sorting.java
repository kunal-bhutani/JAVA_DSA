// * sorting in java  #bubble sort #selection sort #insertion sort *

import java.util.*;
public class sorting {

    static void printarr(int arr[])
    {
        for(int i = 0 ; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }

              // *bubble sort*
            //   *time complixity is O(n^2)*

static void  bubbleSort(int arr[])
{
    for(int i = 0 ; i<arr.length-1 ; i++)
    {
        for(int j = 0 ; j<arr.length-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                // swap

                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    System.out.println("output of sort");
   printarr(arr);
}

                    // *selction sort*

    public static void selectionSort(int arr [])
    {
        for(int i =0 ; i < arr.length-1;i++)
        {
            int smallest = i;
            for(int j = 1+i ; j<arr.length ; j++)
            {
                if(arr[smallest]>arr[j])
                {
                   smallest = j;
                }
            }
        
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
        }
        System.out.println("output of selction sort is ");
        printarr(arr);
    }
    public static void main (String args [])
    {
        int arr[] = {7,8,3,2,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        System.out.println();

        
    }    
}
