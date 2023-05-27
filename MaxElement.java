
//  in it we will find max element using arraylist and its functions


/*it is not complete for user input type */
import java.util.*;

public class MaxElement {

    public static void main(String[] args) {
        int max  = Integer.MIN_VALUE;
        ArrayList <Integer> list = new ArrayList <>();

        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter true to start entering the elements and flase to stop");

        // boolean str = sc.nextBoolean();

        
        // while(str)
        // {
        
        //     int num = sc.nextInt();
        //     list.add(num);


        // }

        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        System.out.println(list);
        for( int i = 0 ; i<list.size(); i++)
        {
            // int ele = list.get(i);
            
            // if(ele> max )
            // {
            //     max = ele;
            // }

            max = Math.max(max,list.get(i));
        }

        System.out.println(max);
    }

}
