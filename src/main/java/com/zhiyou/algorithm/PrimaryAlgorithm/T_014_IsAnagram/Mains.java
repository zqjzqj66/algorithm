package com.zhiyou.algorithm.PrimaryAlgorithm.T_014_IsAnagram;

import java.util.HashMap;
import java.util.Map;

public class Mains {


    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) == null) {
                return false;
            } else {
                int n = map.get(ch);
                if (n == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, n - 1);
                }
            }

        }

        return map.size() == 0 ? true : false;
    }

}
