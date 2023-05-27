import java.util.*;

public class switchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1: {
                System.out.println("hello its 1");
            }
                break;
            case 2: {
                System.out.println("hello its 2");
            }
                break;
            default: {
                System.out.println("input is wrong");
            }

        }

    }

}
