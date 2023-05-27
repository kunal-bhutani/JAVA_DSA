import java.util.*;

public class printTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter numbe a ");
        int a = sc.nextInt();
        // int b = sc.nextInt();
        for (int i = 0; i <= 10; i++)

        {
            int table = i * a;
            System.out.println(a + "*" + i + "=" + table);
        }

    }
}
