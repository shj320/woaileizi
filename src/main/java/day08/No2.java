/**
 * author:sj
 */

package day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class No2 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,4,5,5,6,7};
       HashMap<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        int target=5;
        List<Integer> lists = map.get(target);
        Random random = new Random();
        int i1 = random.nextInt(lists.size());

        for(int i=0;i<10;i++){
            int k = random.nextInt(3);
            System.out.println(k);
        }

    }
}
