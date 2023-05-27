
import java.util.*;

public class scannerArray {
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter numbe a size");
        int a = sc.nextInt();
        int num[] = new int[a];
        for(int i = 0 ; i<a ; i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i = 0 ; i<a ; i++)
        {
            System.out.println(num[i]);
        }
       

        
    }    
}
