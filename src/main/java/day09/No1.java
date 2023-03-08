/**
 * author:sj
 */

package day09;

import java.util.*;

public class No1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<>();
        int[][] events = {{1, 4},{4,4},{2,2},{3,4},{1,1}};
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] t0, int[] t1) {
                return t0[0] - t1[0];
            }
        });

        for(int i=0;i<events.length;i++){
            if(map.containsKey(events[i][0])){
                if(events[i][1]<map.get(events[i][0]).get(0)){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(events[i][1]);
                    map.put(events[i][0],list);
                }else if(events[i][1]==map.get(events[i][0]).get(0)){
                   map.get(events[i][0]).add(events[i][1]);
                }
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(events[i][1]);
                map.put(events[i][0],list);
            }
        }
        int count=0;
        int temp=-1;
        Set<Integer> integers = map.keySet();
        for(Integer i:integers){
            if(temp>i){
                continue;
            }
            temp=map.get(i).get(0);
            count=count+map.get(i).size();
        }
    }
}
