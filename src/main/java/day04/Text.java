/**
 * author:sj
 */

package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        checkArithmeticSubarrays(new int[]{-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10},
                new int[]{0,1,6,4,8,7},
                new int[]{4,4,9,7,9,10});
    }
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ww=new ArrayList<Boolean>();
        int length=l.length;

        for(int i=0;i<length;i++){
            int a=l[i];
            int b=r[i];
            int[] temp=new int[b-a+1];
            boolean wp=true;
            temp=jiequ(nums,temp,a,b);
            Arrays.sort(temp);
            if(temp.length<=2){
                ww.add(true);
                continue;
            }
            for(int s=0;s<temp.length;s++){
                if(s+2<temp.length&&temp[s+1]-temp[s]!=temp[s+2]-temp[s+1]){
                    ww.add(false);
                    wp=false;
                    break;
                }
            }
            if(wp){
                ww.add(true);
            }
        }
        return ww;
    }
    public static int[] jiequ(int[] a,int[] b,int start,int end){
        for(int i=start,j=0;i<=end;i++,j++){
            b[j]=a[i];
        }
        return b;
    }
}
