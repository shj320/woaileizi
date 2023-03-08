/**
 * author:sj
 */

package day10;

import java.util.ArrayList;

public class No3 {
    public String maximumBinaryString(String binary) {
        boolean flog=false;
        StringBuffer str=new StringBuffer(binary);
        for(int i=0;i<str.length()-1;i=i+2){
            if(str.charAt(i)=='0'&&str.charAt(i+1)=='0'){
                str.setCharAt(i,'1');
            }
            if(str.charAt(i)=='1'&&str.charAt(i+1)=='0'){
                str.setCharAt(i,'0');
                str.setCharAt(i+1,'1');
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        return null;
    }

    public static void main(String[] args) {
        No3 no3 = new No3();
        no3.maximumBinaryString("000110");
    }
}
