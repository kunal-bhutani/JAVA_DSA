import java.util.*;

public class Swap {
    public static  void swap(ArrayList<Integer>list , int indx1 , int indx2) // syntax to pass an array list
    {
         int temp = list.get(indx1);
    list.set(indx1, list.get(indx2));
    list.set(indx2,temp);
    System.out.println(list);
    }
    public static void main(String[] args) {

        
        ArrayList<Integer>list = new ArrayList <>();

        list.add(8);   //  Tm => 0(1) 
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);

        System.out.println(list);
        int indx1 = 1 , indx2 = 3;
        swap(list,indx1,indx2);

       

        

    }
    
}
