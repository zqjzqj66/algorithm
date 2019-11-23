package com.zhiyou.algorithm.PrimaryAlgorithm.T_015_IsPalindrome;

public class Mains {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.isDigit(ch)?ch:Character.toLowerCase(ch));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}

