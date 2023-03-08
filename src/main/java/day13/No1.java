/**
 * author:sj
 */

package day13;

import sun.rmi.server.InactiveGroupException;

import java.util.*;

public class No1 {
    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.lengthOfLongestSubstring("au");
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)
        {
            return 1;
        }
        int i=0;
        int j=0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer,Boolean> map1=new HashMap<>();
        Deque<Integer> integers = new LinkedList<>();

        int aaa=0;
        int temp=0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                temp=Math.max(temp,j-i);
                i=j;
                map.clear();
            }else if(j==s.length()-1){
                temp=Math.max(temp,j-i);
            }
            map.put(s.charAt(j),0);
            j++;
        }
        return temp;
    }
}
