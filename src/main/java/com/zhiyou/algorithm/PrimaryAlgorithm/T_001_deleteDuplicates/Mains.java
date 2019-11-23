package com.zhiyou.algorithm.PrimaryAlgorithm.T_001_deleteDuplicates;

public class Mains {

    public static void main(String[] args) {

        System.out.println(removeDuplicates1(1, 1, 2, 3, 4, 5, 5, 5));
    }

    public static int removeDuplicates(int... nums) {

        return 0;
    }

    public static int removeDuplicates1(int... nums) {

        //判断nums为null
        if (nums == null) {
            return 0;
        }
        //判断nums的length为1
        if (nums.length == 1) {
            return 1;
        }

        int rep = 0;
        int i=1;
        int s=nums.length;
        int len=s;
        while(i<len){
            while(nums[i - 1] == nums[i] && i<len){
                //有重复的就加一
                rep++;
                //然后将后面的元素向前移动
                for (int j = i; j < len && j + 1 < len; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
            }
            i++;
        }

        for (int j = 0; j <s-rep ; j++) {
            System.out.println(nums[j]);
        }

        return s-rep;
    }

}
