/**
 * author:sj
 */

package day10;

public class No1 {
    public static void main(String[] args) {
        No1 no1 = new No1();
        no1.minFlipsMonoIncr("00011000");
    }
    public int minFlipsMonoIncr(String s) {
        //连续为0
        int i=0;
        for(;i<s.length();i++){
            if(s.charAt(i)=='1'){
                break;
            }
        }
        //连续为1
        int j=s.length()-1;
        for(;j>=0;j--){
            if(s.charAt(j)=='0'){
                break;
            }
        }
        int count1=0;
        int count2=0;
        int temp1=i;
        int temp2=j;
        for(;temp1<=j;temp1++){
            if(s.charAt(temp1)=='0'){
                count1++;
            }
        }
        for(;temp2>=i;temp2--){
            if(s.charAt(temp2)=='0'){
                count2++;
            }
        }
        int count3=0;
        int count4=0;
        for(int z=0;z<s.length();z++){
            if(s.charAt(z)=='1'){
                count3++;
            }else {
                count4++;
            }
        }
        int min = Math.min(count3, count4);
        int min1 = Math.min(count2, count1);
        return Math.min(min,min1);
    }
}
