public class ToUpperCase {
    public static String toUpper(String str){
        StringBuilder sb = new String("");
        char ch = Character.toUpperCase(str.charAt(0));
        for(int i = 0 ; i<str.length();i++)
        {
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }

            
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "hello my self";
        System.out.println(toUpper(str));

    }
    
}
