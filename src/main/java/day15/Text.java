/**
 * author:sj
 */

package day15;

public class Text {
    public static void main(String[] args) {
        String temp="abcdef";
        StringBuffer stringBuffer = new StringBuffer(temp);
        char c = stringBuffer.charAt(2);
        stringBuffer.insert(2,'w');
        System.out.println(stringBuffer.toString());
    }
}
