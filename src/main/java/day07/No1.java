/**
 * author:sj
 */

package day07;

import java.util.Arrays;
import java.util.Collections;

public class No1 {
    public static void main(String[] args) {
        long a=310;
        String s = Long.toString(a);
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        if(chars[0]=='-'){
            String s1 = new String(chars);
            StringBuffer stringBuffer = new StringBuffer(s1).reverse();
            String s2 = new String(stringBuffer).replace("-","");
            Long aLong = Long.valueOf(s2);
            System.out.println(aLong*-1);
        }else {
            if(chars[0]=='0'){
                char temp;
                for(int i=0;i<chars.length;i++){
                    if(chars[i]!='0'){
                        temp=chars[i];
                        chars[i]=chars[0];
                        chars[0]=temp;
                        break;
                    }
                }
            }
            String s1 = new String(chars);
            Long aLong = Long.valueOf(s1);
            System.out.println(aLong);
        }


    }
}
