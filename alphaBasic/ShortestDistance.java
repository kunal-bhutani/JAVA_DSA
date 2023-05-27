// package alpha;

import java.util.Scanner;

public class ShortestDistance {

    public static double findDistance(String str){
        int n = str.length();
        double countx = 0 , county =  0 , ans ,fans;

        for(int i = 0 ; i<n ; i++){
            if(str.charAt(i)=='n'){
                countx++;
            }
            if(str.charAt(i)=='s'){
                countx--;
            }
            if(str.charAt(i)=='e'){
                county++;
            }
            if(str.charAt(i)=='w'){
                county--;
            }
        }
        ans = Math.pow(countx, 2) + Math.pow(county, 2);
        fans = Math.sqrt(ans);

        return fans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findDistance(str));  
    }

    
}
