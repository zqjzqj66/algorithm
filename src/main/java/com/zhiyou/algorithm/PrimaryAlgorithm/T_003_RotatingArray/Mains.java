package com.zhiyou.algorithm.PrimaryAlgorithm.T_003_RotatingArray;

public class Mains {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6,7};
        rotate(arr, 3);
    }

    public static void rotate(int[] nums, int k) {
        //处理一些特殊的情况
        //其中比较重要的是 k%nums.lenght==0
        if (nums == null || nums.length == 1 || k == 0 || k % nums.length == 0) {
            return;
        }

        //当k大于nums。length的时候
        k = (k > nums.length) ? k % nums.length : k;

        reserve(nums, nums.length-k,nums.length-1 );
        reserve(nums,0 ,nums.length-k-1 );
        reserve(nums,0 ,nums.length-1 );


    }


    private static void reserve(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }

}
