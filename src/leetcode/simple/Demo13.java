package leetcode.simple;

import java.util.HashMap;
import java.util.Map;

//利用哈希表存储所有的可能性，然后首先遍历出两个字符的情况，再遍历一个字符的情况
public class Demo13 {
    public static int romanToInt(String s) {
        Map<String,Integer> map=new HashMap<>();//建立一个哈希表
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int num=0;
        for (int i = 0; i < s.length();) {
            if(i+1<s.length()&&map.containsKey(s.substring(i,i+2)))//containsKey函数->如果此映射包含指定键的映射关系，则返回 true
            {
                num+=map.get(s.substring(i,i+2));//获取指定键的值
                i+=2;//后移两位继续判断
            }
            else {
                num += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String s="IVIVIV";
        System.out.println(romanToInt(s));
    }
}
