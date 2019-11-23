package com.zhiyou.algorithm.PrimaryAlgorithm.T_006_MixedSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mains {

    public static void main(String[] args) {
        int[] a = new int[]{4,9,5};
        int[] b = new int[]{9,4,9,8,4};
        intersect(a, b);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) == null) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }

//        map.keySet().stream().forEach(System.out::print);
//        map.values().stream().forEach(System.out::print);

        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
       // list.stream().forEach(System.out::println);

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

}
