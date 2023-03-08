/**
 * author:sj
 */

package day5;

import java.util.Arrays;
import java.util.HashMap;

public class No {
    public static void main(String[] args) {
        No no = new No();
        no.numRabbits(new int[]{0,3,2,0,3,3,4,2,4,3,2,4,4,3,0,1,3,4,4,3});
    }
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==0){
                count++;
            }else{
                int temp=answers[i];
                int w=0;
                while(i<answers.length&&temp==answers[i]){
                    w++;
                    i++;
                }
                if(w<=temp+1){
                    count=count+temp+1;
                }else{
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer reverse = stringBuffer.reverse();
                    StringBuffer stringBuffer1 = stringBuffer.deleteCharAt(0);
                    char c = stringBuffer.charAt(0);
                    HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

                    count=count+(w/(temp+1))*(temp+1)+(w%(temp+1))*(temp+1);
                }

            }
            i--;
        }

        return count;
    }
}
