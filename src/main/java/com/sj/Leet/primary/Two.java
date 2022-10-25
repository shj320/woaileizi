/**
 * author:sj
 */

package com.sj.Leet.primary;
/*
* 输入：prices = [7,1,5,3,6,4]
输出：7
解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。
     总利润为 4 + 3 = 7 。


* */
public class Two {
    public static void main(String[] args) {
        Two two = new Two();
        int[] nums ={1,2,3,4,5};
        System.out.println(two.maxProfit(nums));
    }
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }
        int l=0;
        int count=0;
        for(int r =1;r<prices.length;r++){
            if(prices[l]>prices[r]){
                l++;
            }else{
                if(r+1==prices.length){
                    count=count+prices[r]-prices[l];
                    return count;
                }
                if(prices[r+1]<prices[r]){
                    count=count+prices[r]-prices[l];
                    if(prices.length<=r+1){
                        break;
                    }
                    l=r+1;
                    r++;
                }
            }
        }
        return count;
    }
}
