/**
 * author:sj
 */

package day08;

import java.util.ArrayList;
import java.util.List;

public class No1 {
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] temp=new int[]{1,2,3,4,5,6,7,8,9};
        boolean[] flog=new boolean[9];
        List<Integer> ans=new ArrayList<>();
        digui(0,ans,flog,temp,k,n,0);
        return list;
    }
    public void digui(int start,List<Integer> ans,boolean[] flog,int[] temp,int k,int n,int count){
        if(ans.size()>k){
            return;
        }
        if(count==n){
            list.add(new ArrayList<Integer>(ans));
            return;
        }
        for(int i=start;i<temp.length;i++){
            if(flog[i]==true){
                continue;
            }
            flog[i]=true;
            count=count+temp[i];
            ans.add(temp[i]);
            digui(i,ans,flog,temp,k,n,count);
            ans.remove(ans.size()-1);
            flog[i]=false;
            count=count-temp[i];
        }
    }

    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.combinationSum3(3,7);
    }
}
