package com.zhiyou.algorithm.PrimaryAlgorithm.T_004_DuplicateArray;


import java.util.*;

public class Mains {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(1,2,3,1));
    }

    public static boolean containsDuplicate(int...nums) {
        Map<Integer, Object> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],null );
        }
        return nums.length!=map.size();
    }
}
