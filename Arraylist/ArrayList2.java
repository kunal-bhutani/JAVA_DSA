import java.util.*;
public class ArrayList2 {
     public static void main(String[] args) {
        
    
    ArrayList<Integer> list = new ArrayList <> ();

    list.add(4);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(5);

    System.out.println(list.size());

        // printing a array list 


    // for(int i = 0 ; i< list.size(); i++)
    // {
    //     System.out.print(list.get(i)+" ");
    // }
    

    // printing a reverse array list
        //  TM -> is 0(n)
        for(int i = list.size()-1; i>=0 ; i--)
        {
            System.out.print(list.get(i)+" ");
        }
     }
}
