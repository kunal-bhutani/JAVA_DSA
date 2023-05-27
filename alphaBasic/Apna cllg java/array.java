import java.util.*;

public class array {
    public static void main (String args [])
    {
        // int arr[] = new int[10];

        //  arr[0] = 29;
        //  arr[1] = 2;
        //  arr[2] = 9;


        // **********or***********


        int arr[] = {4,2,5};
         for(int i = 0 ; i<3 ; i++)
        {
            System.out.println(arr[i]);
        }
        
            // other way to iterate

            for(int i : arr)
            {
                System.out.print(i+" ");
            }

        
    }    
}
