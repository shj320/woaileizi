/**
 * author:sj
 */

package day16;

import java.util.Scanner;

public class No {
    public static void main(String[] args) {
        // 读入数据的代码
        Scanner reader = new Scanner(System.in);
        // 物品的数量为N
        int N = reader.nextInt();
        // 背包的容量为V
        int V = reader.nextInt();
        // 一个长度为N的数组，第i个元素表示第i个物品的体积；
        int[] v = new int[N + 1] ;
        // 一个长度为N的数组，第i个元素表示第i个物品的价值；
        int[] w = new int[N + 1] ;

        for (int i=1 ; i <= N ; i++){
            // 接下来有 N 行，每行有两个整数:v[i],w[i]，用空格隔开，分别表示第i件物品的体积和价值
            v[i] = reader.nextInt();
            w[i] = reader.nextInt();
        }
        reader.close() ;
        int[][] temp=new int[N+1][V+1];
        temp[0][0]=0;
        for(int i=1;i<=N;i++){
            for(int j=0;j<=V;j++){
                if(j>=v[j]){
                    temp[i][j]=Math.max(temp[i-1][j],temp[i-1][j-v[i]]+w[i]);
                }else{
                    temp[i][j]=temp[i-1][j];
                }
            }
        }
        System.out.println(temp[N][V]);
    }
}
