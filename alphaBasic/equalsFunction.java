
public class equalsFunction {

    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";                 // memory reference is string constant pool
        String s3 = new String("tony");  // memory reference is heap 
        if (s1 == s2)                                       // it will compare the memory refrences according to object
        {
            System.out.println("string are equal");
        } else {
            System.out.println("not equal");
        }
        if (s1 == s3) {
            System.out.println("string are equal");
        } else {
            System.out.println("not equal");
        }
        if(s1.equals(s3))                                   // it will compare the content of the string 
         {
            System.out.println("string are equal");
        }
        else
        {
            System.out.println("not equal");
        }

        
        
    }
}
