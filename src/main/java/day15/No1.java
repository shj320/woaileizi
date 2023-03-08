/**
 * author:sj
 */

package day15;

import day5.No;

import java.util.LinkedList;
import java.util.List;

public class No1 {
    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.findMinFibonacciNumbers(7);
    }
    List<Integer> list=new LinkedList<>();
    public int findMinFibonacciNumbers(int k) {
        list.add(1);
        list.add(1);
        fei(k);
        for(int i:list){
            System.out.println(i);
        }
        return 0;
    }
    public void fei(int k){
        if(!(list.get(list.size()-1)<k)){
            return;
        }
        list.add(list.get(list.size()-1)+list.get(list.size()-2));
        fei(k);
    }
}
