import java.util.ArrayList;
import java.util.Collections;

public class MostWater {

    // public static int storeWater(ArrayList<Integer> list) {
    // int max = 0;

    // brute force Tm -> 0(n^2)

    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i+1; j < list.size(); j++) {
    // int minHeight = Integer.min(list.get(i), list.get(j));
    // int width = j - i;
    // int area = minHeight * width;
    // if (area > max) {
    // max = area;
    // }
    // }
    // }
    // return max;

    // }

    // optimise solution Tm -> O(n) it is also called 2 pointer approach


    public static int storeWaterOpt(ArrayList<Integer> list)
    {
        int lp = 0;
        int rp = list.size()-1;
        int maxWater = 0;

        while(lp<rp)
        {
            // int height = Integer.min(list.get(lp),list.get(rp));
            int height = Math.min(list.get(lp),list.get(rp));
            int width = rp - lp;
            int newArea = height*width;

            // if(newArea>maxWater)
            // {
            //     maxWater = newArea;
            // }

            maxWater = Math.max(maxWater,newArea);

            if(lp<rp)
            {
                lp++;
            }
            else
            {
                rp--;
            }

        }
        return maxWater;
    }
             

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWaterOpt(list) +" optimised way se");
    }

}
