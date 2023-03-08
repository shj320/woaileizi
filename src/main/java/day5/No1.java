/**
 * author:sj
 */

package day5;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No1 extends ClassLoader {
    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.eliminateMaximum(new int[]{3,2,4},new int[]{5,3,2});
        no1.maximumNumber("214010",new int[]{6,7,9,7,4,0,3,4,4,7});
        Set<Integer> set=new HashSet<>();

    }
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] temp=new int[dist.length];
        for(int i=0;i<dist.length;i++){
            temp[i]=(int)Math.ceil(dist[i]/speed[i]);
        }
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]<i+1){
                return i;
            }
        }
        return dist.length;
    }
    public String maximumNumber(String num, int[] change) {
        StringBuffer temp=new StringBuffer();
        int w=0;
        boolean flag=false;
        for(int i=0;i<num.length();i++){
            String sts=String.valueOf(num.charAt(i));
            int a=Integer.parseInt(sts);
            if(a<change[a]){
                if(i==0&&w==0){
                    temp.append(change[a]);
                    flag=true;
                    w=i;
                    continue;
                }
                if(flag){
                    if(i-w==1){
                        temp.append(change[a]);
                        w=i;
                    }else{
                        temp.append(a);
                    }
                }else{
                    w=i;
                    flag=true;
                    temp.append(change[a]);
                }


            }else if (a==change[a]){
                if(i-w==1){
                    temp.append(change[a]);
                    w=i;
                }else{
                    temp.append(a);
                }
            }
            else{
                temp.append(a);
            }


        }
        return temp.toString();
    }

}
