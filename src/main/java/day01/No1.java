/**
 * author:sj
 */

package day01;

import java.util.ArrayList;
import java.util.Arrays;

public class No1 {
    public static void main(String[] args) {
        findClosest(new String[]{"I","am","a","student","from","a","university","in","a","city"},"a","student");
    }
    public static int findClosest(String[] words, String word1, String word2) {
        int a=-1;
        int b=-1;
        int c=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(word1.equals(words[i])){
                a=i;
                if(a!=-1&&b!=-1){
                    c=Math.min(Math.abs(a-b),c);
                }
            }
            if(word2.equals(words[i])){
                b=i;
                if(a!=-1&&b!=-1){
                    c=Math.min(Math.abs(a-b),c);
                }
            }
            ArrayList<Integer> integers = new ArrayList<>();
            Integer[] objects = (Integer[]) integers.toArray();
            int[] ints = new int[5];

        }
        return c;
    }
}
