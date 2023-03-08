/**
 * author:sj
 */

package day07;

public class No03 {
    public static void main(String[] args) {
        numberOfRounds("12:55","13:36");
    }
    public static int numberOfRounds(String loginTime, String logoutTime) {

        String substring = loginTime.substring(0, 2);
        String substring1 = loginTime.substring(3, 5);
        String substring2 = logoutTime.substring(0, 2);
        String substring3 = logoutTime.substring(3, 5);
        int a = Integer.parseInt(substring);
        int b = Integer.parseInt(substring1);
        int c = Integer.parseInt(substring2);
        int d = Integer.parseInt(substring3);
        if(b<15&&b>0){
            b=15;
        }else if(b<30&&b>15){
            b=30;
        }else if(b<45&&b==0){}
        return 0;
    }
}
