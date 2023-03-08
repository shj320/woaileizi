/**
 * author:sj
 */

package day03;

public class No1 {
    public static int countCollisions(String directions) {
        int[] temp=new int[directions.length()];
        int count=0;
        for(int i=0;i<directions.length();i++){
            if(i+1<directions.length()&&directions.charAt(i)=='R'&&directions.charAt(i+1)=='L'){
                temp[i]=1;
                temp[i+1]=1;
                count=count+2;
                i++;
            }else if(i+1<directions.length()&&directions.charAt(i)=='R'&&directions.charAt(i+1)=='S'){
                count=count+1;
                temp[i]=1;
                temp[i+1]=1;
                i++;
            }else if(i-1>=0&&directions.charAt(i)=='L'&&temp[i-1]==1){
                temp[i]=1;
                count=count+1;
            }else if(i-1>=0&&directions.charAt(i)=='L'&&directions.charAt(i-1)=='S'){
                temp[i]=1;
                count=count+1;
            }else if(i+1<directions.length()&&directions.charAt(i)=='R'&&directions.charAt(i+1)=='R'){
                int w=0;
                while(i<directions.length()&&directions.charAt(i)=='R'){
                    temp[i]=1;
                    i++;
                    w++;

                }
                if(i<directions.length()&&directions.charAt(i)=='L'){
                    count=count+2+w-1;
                    temp[i]=1;
                }else if(i<directions.length()&&directions.charAt(i)=='S'){
                    count=count+w;
                    temp[i]=1;
                }
            }
        }
        return count;
    }
    public static int countCollisions1(String s) {
        int l = 0, r = s.length() - 1;
        while(l <= r && s.charAt(l) == 'L'){++l;}
        while(l <= r && s.charAt(r) == 'R') {--r;}
        int res = 0;
        for(int i = l; i <= r; ++i) {
            if(s.charAt(i) == 'L' || s.charAt(i) == 'R'){
                ++res;
            }
        }

        return res;
    }





    public static void main(String[] args) {
        countCollisions1("SLSLRLLS");
    }
}
