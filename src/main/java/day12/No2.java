/**
 * author:sj
 */

package day12;

import java.util.*;

public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i0 = scanner.nextInt();
        int i1 = scanner.nextInt();
        int[][] ints = new int[i1][i1];
        for(int i=0;i<i1;i++){
            for (int j=0;j<i1;j++){
                ints[i][j]=scanner.nextInt();
            }
        }
        int ss = ss(ints, i0);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int[] temp=new int[]{1,3,5,7,9};
        HashMap<Character, Integer> map = new HashMap<>();

        System.out.println(ss);
    }
    public static int ss(int[][] temp,int a){
            int temps=999999999;
            for(int i=0;i<temp.length;i++){
                int count=0;
                for(int j=0;j<temp[0].length;j++){
                    if(temp[i][j]==0){
                        count+=a;
                    }else {
                        count+=temp[i][j];
                    }
                }
                temps=Math.min(temps,count);
            }
            return temps;
    }
}
