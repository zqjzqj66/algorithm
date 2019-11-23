package com.zhiyou.algorithm.PrimaryAlgorithm.T_008_MoveZero;

import java.util.Arrays;

public class Mains {

    public static void main(String[] args) {
        moveZeroes(0,0,0,0,0,0,1);
    }

    public static void moveZeroes(int...nums) {
        int n=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[n]=nums[i];
                n++;
            }
        }
        for (int i = n; i <nums.length ; i++) {
            nums[i]=0;
        }
        Arrays.stream(nums).forEach(System.out::print);
    }

}
