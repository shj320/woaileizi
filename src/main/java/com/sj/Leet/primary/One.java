/**
 * author:sj
 */

package com.sj.Leet.primary;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class One {
    public int maxArea(int[] height) {
        int right=0;
        int left=height.length-1;
        int max=Math.min(height[0],height[left])*(left);
        while(left>right){
            int temp=Math.min(height[right],height[left])*(left-right);
            int a=  Math.max(Math.min(height[right+1],height[left])*(left-right),Math.min(height[right],height[left-1])*(left-right));
            int b=Math.max(a,temp);
            max=Math.max(b,max);
            right++;
            left--;
        }
        return max;
    }

    public static void  s(){


    }



    public static void main(String[] args) {

        One one = new One();
        one.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
