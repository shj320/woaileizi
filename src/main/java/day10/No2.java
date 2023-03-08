/**
 * author:sj
 */

package day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No2 {
    public static void main(String[] args) {

    }
    public String addBinary(String a, String b) {
        List<Character> list = new LinkedList<>();
        int temp1=a.length()-1;
        int temp2=b.length()-1;
        while (temp1>=0||temp2>=0){
            if(temp1<0){
                list.add(b.charAt(temp2));
                temp2--;
            }else if(temp2<0){
                list.add(a.charAt(temp1));
                temp1--;
            }else {
                if(a.charAt(temp1)=='1'&&b.charAt(temp2)=='1'){
                    list.add('0');
                    list.add('1');
                }else if(a.charAt(temp1)=='1'&&b.charAt(temp2)=='1'&&temp1==0&&temp2==0){
                    list.add('1');
                }
                else if(a.charAt(temp1)=='0'&&b.charAt(temp2)=='0'){
                    list.add('0');
                }else {
                    list.add('1');
                }
                temp1--;
                temp2--;
            }
        }
        StringBuffer stringBuffer=new StringBuffer();
        for(char s:list){
            stringBuffer.append(s);
        }
        return new String(stringBuffer.reverse());
    }
}
