/**
 * author:sj
 */

package day15;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cishu = sc.nextInt();
        String w=sc.next();
        StringBuffer stringBuffer = new StringBuffer(w);

        for(int i=0;i<cishu;i++){
           int temp1=sc.nextInt();
            int temp2=sc.nextInt();
            int a=0;
            while(temp1<=temp2){
                stringBuffer.insert(temp1+a,stringBuffer.charAt(temp1-1+a));
                a++;
                temp1++;
            }
//            stringBuffer.insert(temp1,stringBuffer.charAt(temp1-1));
//            stringBuffer.insert(temp2,stringBuffer.charAt(temp2-1));
        }

        System.out.println(stringBuffer.toString());
    }
}
