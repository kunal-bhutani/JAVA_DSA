import java.util.*;

public class functions {

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter your name");
        String name = sc.next();

        printName(name);

    }
}
