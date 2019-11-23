package com.zhiyou.algorithm.PrimaryAlgorithm.T_009_TwoSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mains {

    public static void main(String[] args) {

        int[] ints = new int[]{2,7,11,15};
        twoSum(ints,9 );
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i );
        }

        for (int i = 0; i <nums.length ; i++) {
            int n = target - nums[i];
            Integer integer = map.get(n);
            if(integer!=null && integer>i){
                return new int[]{i,integer};
            }
        }
        return null;

    }
}
