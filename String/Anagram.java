import java.lang.reflect.Array;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";
        str1 = str1.toLowerCase(); // can produce an error plz check it
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char s1[] = str1.toCharArray();
            char s2[] = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            if (Arrays.equals(s1, s2)) {
                System.out.println(str1 + " and " + str2 + " is anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " is not anagram");

            }

        } else {
            System.out.println(str1 + " and " + str2 + " is not anagram ");
            

        }
        

    }

}
