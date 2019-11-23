package com.zhiyou.algorithm.PrimaryAlgorithm.T_015_StrStr;

public class Mains {

    public static void main(String[] args) {
        //当need是空字符串的时候 这里的是返回的是0
        System.out.println(strStr("hello", ""));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.contains(needle)?haystack.indexOf(needle):-1;
    }
}
