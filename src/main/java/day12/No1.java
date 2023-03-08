/**
 * author:sj
 */

package day12;

import java.util.HashMap;
import java.util.Map;

public class No1 {
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap< Integer, Integer > mp = new HashMap < > ();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
    public int findMaxLength(int[] nums) {
        /**
         将数组中的0换成-1， 求和为0的最长子数组 转换成前缀和问题
         */
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0, sum = 0;
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.subarraySum(new int[]{3,4,7,2,-3,1,4,2},7);
        no1.findMaxLength(new int[]{1,0,1,0,0,0,1,1,1});
    }
}
