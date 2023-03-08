/**
 * author:sj
 */

package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp= new int[n];
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();
        }
        int zuixiaozi = zuixiaozi(n, temp);
        System.out.println(zuixiaozi);

    }
    public static int zuixiaozi(int n,int[] temp){
        if(n==1){
            return 1;
        }
        Map<Integer,Integer> map=new HashMap<>();
        if(Math.abs(temp[0]-temp[1])==1){
            map.put(0,-1);
        }
        map.put(0,1);
        for(int i=1;i<n;i++){
            if(i+1<n&&Math.abs(temp[i]-temp[i-1])==1&&Math.abs(temp[i+1]-temp[i])==1){
                map.put(i,-2);
            }else if(Math.abs(temp[i]-temp[i-1])==1){
                map.put(i,1);
            }else if (i+1<n&&Math.abs(temp[i+1]-temp[i])==1){
                map.put(i,-1);
            }else {
                map.put(i,-3);
            }
        }
        Set<Integer> set = map.keySet();
        int a=0;
        int b=0;
        int count=0;
        for(int i:set){
            if(map.get(i)==1||map.get(i)==-2){
                a++;
            }else {
                count=Math.max(count,a-b);
                if(map.get(i)==-1){
                    b=a-1;
                }
            }
        }
        count=Math.max(count,a-b);
        return count;
    }
}
