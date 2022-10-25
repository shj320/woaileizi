/**
 * author:sj
 */

package com.sj.Leet.primary;

import java.util.ArrayList;
import java.util.List;
//希尔排序
public class ListNode {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,0};
        for(int gap=a.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<a.length;i++){
                int curr=a[i];
                int j=i-gap;
                while(j>=0&&a[j]>=curr){
                    a[j+gap]=a[j];
                    j=j-gap;
                }
                a[j+gap]=curr;
            }
        }
        for (Integer x:a
             ) {
            System.out.println(x);
        }
    }


  }
