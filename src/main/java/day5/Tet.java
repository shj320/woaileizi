/**
 * author:sj
 */

package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tet {
    public static void main(String[] args) {
        Tet tet = new Tet();
      tet.countNicePairs(new int[]{13,10,35,24,76});
    }
    public int countNicePairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int temp=i-rev(i);
            if(!map.containsKey(temp)){
                map.put(temp,1);
            }else{
                map.put(temp,map.get(temp)+1);
            }
        }
        Set<Integer> set = map.keySet();
        int count=0;
        for(int a:set){
            if(map.get(a)>1){
                Integer integer = map.get(a);
                count=count+(integer*(integer-1))/2;
            }
        }
        return count;
    }
    public int rev(int num){
        String temp=String.valueOf(num);
        StringBuffer a= new StringBuffer(temp);
        StringBuffer reverse = a.reverse();
        while(reverse.charAt(0)=='0'){
            reverse.deleteCharAt(0);
        }
        return Integer.valueOf(new String(reverse));
    }
}
