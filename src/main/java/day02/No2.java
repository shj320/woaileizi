/**
 * author:sj
 */

package day02;

import java.util.ArrayList;
import java.util.List;

public class No2 {
    public static List<Integer> goodIndices(int[] nums, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int count = 1;
        if (k == 1) {
            for (int i = 1; i < n - 1; i++) {
                res.add(i);
            }
            return res;
        }
        for (int i = 1; i < n - k - 1; i++) {
            if (nums[i] <= nums[i - 1] && nums[i + k + 1] >= nums[i + k]) {
                count++;
                if (count >= k) {
                    res.add(i + 1);
                }
            } else {
                count = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        goodIndices(new int[]{2,1,1,1,3,4,1},2);
    }
}

