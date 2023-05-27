

public class ToUpperCase {

public static StringBuffer toUpperCase(String str)
{
    StringBuffer sb = new StringBuffer("");

     char ch =Character.toUpperCase(str.charAt(0));
     sb.append(ch);

     for(int i = 1 ; i<str.length() ; i++)
     {
        if(str.charAt(i) == ' ' && i<str.length()-1)
        {
            sb.append(str.charAt(i));
            i++;
            char ch1 = Character.toUpperCase(str.charAt(i));
            sb.append(ch1);
        }
        else{
            sb.append(str.charAt(i));
        }
     }

    return sb;
}
    public static void main(String[] args) {

        String str = "hi my self kunal  ";

        System.out.println(toUpperCase(str));

        
    }
    
}
