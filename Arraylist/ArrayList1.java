// in it we will discuss the basic functonality of the linked list

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add opereation

        list.add(8);   //  Tm => 0(1) 
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list);

         // get operation

         int ele = list.get(4);
         System.out.println(ele);

         // remove operation

         list.remove(2);
         System.out.println(list);


         // set element at index
          list.set(2,0);
          System.out.println(list);

          //  contain element 

          System.out.println(list.contains(2));

          // add at index it shifts rest values

          list.add(1,9);
          System.out.println(list);

    }

}
