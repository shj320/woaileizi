/**
 * author:sj
 */

package day15;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp1=v*v+4*x*y;
        double ans1=(-v+Math.sqrt(temp1))/(2*x);
        double ans2=(-v-Math.sqrt(temp1))/(2*x);
        if(ans1>0&&ans2<0){
            System.out.println(ans1);
        }else if(ans1<0&&ans2>0){
            System.out.println(ans2);
        }else if(ans1>0&&ans2>0){
            System.out.println(Math.min(ans1,ans2));
        }
    }
}
