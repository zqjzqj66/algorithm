package com.zhiyou.algorithm.PrimaryAlgorithm.T_013_FirstUniqChar;

import java.util.*;

public class Mains {

    public static void main(String[] args) {


        System.out.println(firstUniqChar("loveleetcode"));
    }


    public static int firstUniqChar(String s) {

        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) != null) {
                //这里千万要注意了 要使用强转，如果是基本数据类型的话，会造成char转int的  然后报outofindex
                list.remove((Character) ch);
            } else {
                list.add(ch);
                map.put(ch, i);
            }
        }

        if (list.size() == 0) {
            return -1;
        }
        return map.get(list.get(0));
    }
}

