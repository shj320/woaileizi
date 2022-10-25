/**
 * author:sj
 */

package com.sj.Leet.primary;

import java.util.*;

public class Three {
    public static void main(String[] args) {
        Three three = new Three();
        three.lengthOfLongestSubstring("abba");

    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int res=0;
        for(int i=0,j=0;i<c.length;++i){
            if (map.containsKey(s.charAt(i))) {
                j = map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i), i);

            res = Math.max(res, i - j+1);
        }
        return res;
    }

      }



