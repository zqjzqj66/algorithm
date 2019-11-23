package com.zhiyou.algorithm.PrimaryAlgorithm.T_016_CountAndSay;

import java.util.ArrayList;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        System.out.println(countAndSay(1));
    }

    public static String countAndSay(int n) {
        return loop(1, n, "1");
    }

    private static String loop(int m, int n, String str) {
        if (m == n) {
            return str;
        }

        List<Character> key = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i==0){
                key.add(ch);
                value.add(1);
            }else{
                if (key.get(key.size() - 1) == ch) {
                    Integer remove = value.remove(value.size() - 1);
                    value.add(remove + 1);
                } else {
                    key.add(ch);
                    value.add(1);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder(2 * value.size());
        for (int i = 0; i < value.size(); i++) {
            stringBuilder.append(value.get(i));
            stringBuilder.append(key.get(i));
        }

        return loop(m + 1, n, stringBuilder.toString());
    }
}
