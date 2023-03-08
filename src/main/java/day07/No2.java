/**
 * author:sj
 */

package day07;

import java.util.Arrays;

public class No2 {
    public static void main(String[] args) {
        wiggleSort(new int[]{1,5,1,1,6,4});
    }
    public static void wiggleSort(int[] nums) {
        int[] temp=new int[nums.length];
        Arrays.sort(nums);
        int j=nums.length-1;
        for(int i=1;i<nums.length;i=i+2,j--){
            temp[i]=nums[j];

        }
        for(int i=0;i<nums.length;i=i+2,j--){
            temp[i]=nums[j];
        }
        nums=temp;
        System.out.println(Arrays.toString(nums));
    }
}
