package com.zhiyou.algorithm.PrimaryAlgorithm.T_012_ReverseString;

public class Mains {

    public static void main(String[] args) {
        reverseString('a','b','c','d');
    }

    public static void reverseString(char...s) {

        int start=0;
        int end=s.length-1;
        while(start<end){
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;
        }

        for (int i = 0; i <s.length; i++) {
            System.out.print(s[i]);
        }
    }

}
