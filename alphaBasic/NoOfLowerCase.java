import java.util.Scanner;

public class NoOfLowerCase {

    public static int lowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // int n = str.charAt(i);
            if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word");
        String str = sc.nextLine();
        System.out.println(lowerCase(str));
    }

}
