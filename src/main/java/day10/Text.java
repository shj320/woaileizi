/**
 * author:sj
 */

package day10;

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        Text text = new Text();
        text.RLEIterator(new int[]{3,8,0,9,2,5});

        System.out.println(text.next(2));
        System.out.println(text.next(1));
        System.out.println(text.next(1));
        System.out.println(text.next(2));

    }
    List<Integer> list;
    public void RLEIterator(int[] encoding) {
        list=new ArrayList<Integer>();
        for(int i=0;i<encoding.length;i=i+2){
            int temp=encoding[i];
            while(temp!=0){
                list.add(encoding[i+1]);
                temp--;
            }
        }
        System.out.println(list);
    }

    public int next(int n) {
        while(n!=0){
            if(list.size()<=0){
                return -1;
            }
            int remove = list.remove(0);
            n--;
        }
        return list.get(0);
    }
}
