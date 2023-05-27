import java.util.*;

public class greaterNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nigga enter 2 number .....");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("man a is greater....!" + a);

        } else if (b > a) {
            System.out.println(" b is greater man" + b);
        } else {
            System.out.println("both are same");
        }

    }
}
