package com.zhiyou.algorithm.PrimaryAlgorithm.T_005_OnlyOne;

import java.util.HashMap;
import java.util.Map;

public class Mains {

    public static void main(String[] args) {
        System.out.println(singleNumber(1,2,2,3,3));
    }

    public static int singleNumber(int...nums) {
        if(nums.length==1){
            return nums[1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if (map.get(nums[i])==null){
                map.put(nums[i],1 );
            }else{
                map.remove(nums[i]);
            }
        }
        return (Integer) map.keySet().toArray()[0];
    }

}
