// in it we have to find the if the pair of the number exist in array which is equal to target number or not

import java.util.ArrayList;

public class PairSum {

    //  brute force Tm -> O(n^2)2 loops is used ist from 0 t0 size second i+1 to size; 

    // public static boolean pairSum1(ArrayList<Integer>list,int target)
    // {
    //     for(int i = 0 ; i<list.size();i++)
    //     {
    //         for(int j = i+1 ; j<list.size(); j++)
    //         {
    //             if(list.get(i) + list.get(j) == target)
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    //  second method 2 pointer approach 


    public static boolean pairSum2(ArrayList<Integer>list , int target)
    {
        int lp = 0 ;
        int rp = list.size()-1;

        while(lp !=rp)
        {
            if(list.get(lp) + list.get(rp)== target)
            {
                return true;

            }
            if(list.get(lp) + list.get(rp)< target)
            {
                lp++;

            }
            else
            {
                
                rp--;
            }
        }
        return false;
    }

    public static boolean rotatedPair(ArrayList<Integer>list1,int target)
    {
        int bp = -1 ;
        int n = list1.size();
        for(int i = 0 ; i<list1.size(); i++)
        {
            if(list1.get(i)<list1.get(i+1))
            {
               bp =i;
               break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        
        while(lp != rp)
        {
            // while(lp+rp != target)
            // {
                if(list1.get(lp) + list1.get(rp)== target)
                {
                    return true;
    
                }
            if(list1.get(lp)+list1.get(rp)< target)
            {
                lp = (lp+1)%n;
            }
            else
            {
                rp = (n+rp-1)%n;
            }
        // }
        return true;
        }
        return false;
    }
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 1 ; i<= 5 ; i++)
        {
            list.add(i);
        }
        System.out.println(pairSum2(list, 10));

        ArrayList<Integer>list1 = new ArrayList <>();
        
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1);
        System.out.println(rotatedPair(list1, 16));
        
    }
    
}
