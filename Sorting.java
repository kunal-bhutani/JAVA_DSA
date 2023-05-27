import java.util.Collections;
import java.util.ArrayList;
public class Sorting {
    public static void sort(ArrayList<Integer>li)
    {
        Collections.sort(li);
        System.out.println("this is sorted list");
        System.out.println(li);
        System.out.println("this is sorted list in reverse order");
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);

    }
    public static void main(String args [])
    {
        ArrayList <Integer>list = new ArrayList <>();
        list.add(8);   //  Tm => 0(1) 
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println("this is list");
        System.out.println(list);
        // System.out.println("normal list in reverse order");
        // Collections.reverseOrder(); * it is a comparator only  applicable on fulnctions logic *
        sort(list);



    }
}
