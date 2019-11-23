package com.zhiyou.algorithm.PrimaryAlgorithm.T_017_Merge;

import java.util.Arrays;

public class Mains {

    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
        merge(nums1, 0, nums2, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;

        n = n - 1;
        m = m - 1;
        while (n >= 0 && m >= 0) {
            nums1[k--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
        Arrays.stream(nums1).forEach(System.out::print);

    }

}
