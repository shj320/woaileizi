/**
 * author:sj
 */

package day05;

import java.util.Arrays;

public class No2 {
    public static void main(String[] args) {
        //System.out.println(maxKelements(new int[]{1,10,3,3,3},3));
        double te=10/3.0;
        System.out.println( Math.ceil(te));
    }
    public static long maxKelements(int[] nums, int k) {
        long temp=0;
        for(int i=0;i<k;i++){
            Arrays.sort(nums);
            temp=temp+nums[nums.length-1];
            nums[nums.length-1]= (int) Math.ceil(nums[nums.length-1]/3);
        }
        return temp;
    }
}
