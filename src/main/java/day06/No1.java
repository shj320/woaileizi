/**
 * author:sj
 */

package day06;

import java.util.ArrayList;

public class No1 {
    public static void main(String[] args) {
        int i = magicalString(6);
        System.out.println(i);
    }
    public static int magicalString(int n) {
        if (n==1){
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int a=1;
        int b=2;
        int count=1;
        for(int i=1;i<n;i++){
            if(i%2==0){
                //方1
                Integer temp = list.get(i);
                while (temp!=0){
                    list.add(a);
                    temp--;
                    if(list.size()<=i){
                        count++;
                    }else {
                        break;
                    }

                }
            }else {
                if(i>=list.size()){
                    list.add(b);
                    list.add(b);
                    continue;
                }
                Integer temp = list.get(i);
                while (temp!=0){
                    list.add(b);
                    temp--;
                }
            }
        }
        return count;
    }
}
