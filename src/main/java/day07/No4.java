/**
 * author:sj
 */

package day07;

import java.util.ArrayDeque;
import java.util.Deque;

public class No4 {
    public static void main(String[] args) {

    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Deque<Integer> queue=new ArrayDeque<>();
        int [] indegree=new int [numCourses];
        int [] res=new int [numCourses];
        int cnt=0;//一个指针，表示res数组实际有的元素个数
        int n=prerequisites.length;
        //某元素对应的入度数
        for(int i=0;i<n;i++){
            indegree[prerequisites[i][0]]++;
        }
        //先找到没有入度的结点，入队
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            //将队列中的队首元素出队
            int peek=queue.poll();
            res[cnt++]=peek;
            for(int []p:prerequisites){
                //其出度对应元素入队，并取消掉度；
                if(p[1]==peek){
                    indegree[p[0]]--;
                    if(indegree[p[0]]==0){
                        queue.offer(p[0]);
                    }
                }
            }
        }
        return cnt==numCourses?res:new int [0];
    }
}

