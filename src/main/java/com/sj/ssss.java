/**
 * author:sj
 */

package com.sj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ssss {
    public static void main(String[] args) throws sssss {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入被除数");
        int j= scanner.nextInt();
        System.out.println("输入除数");
        int i = scanner.nextInt();
        try {
            int count=j/i;
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("-------------------------");
        System.out.println("输入性别男或女");
        String sex = scanner.next();
        System.out.println("输入你要进入的厕所男厕或女厕");
        String wwc = scanner.next();
        WC(sex,wwc);

    }
    public static void WC(String sex,String wwc) throws sssss {
        Map<String, String> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("男","男厕");
        stringIntegerMap.put("女","女厕");
        System.out.println(stringIntegerMap.get(sex));
        if(stringIntegerMap.get(sex).equals(wwc)){
            System.out.println("恭喜你进入对了");
        }else {
            throw new sssss("进错厕所了，快点逃走");
        }
    }
}
