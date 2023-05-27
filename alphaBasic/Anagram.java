import java.util.*;

public class Anagram {

    // public static boolean isSame(String str1, String str2) {
    //     if (str1.length() != str2.length()) {

    //         return false;
    //     }

    //     return true;
    // }

    public static boolean isAnagram(String str1, String str2) {
        // int a = 'a';
        int arr[] = new int[52];
        // if (isSame(str1, str2)) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                char n = str1.charAt(i);
                arr[('a' - n) * -1] = count++;
            }

            for (int j = 0; j < str2.length(); j++) {
                char m = str2.charAt(j);

                arr[('a' - m) * -1] = count--;
            }

            System.out.println(count);
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2  strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(isAnagram(str1, str2));

    }

}
