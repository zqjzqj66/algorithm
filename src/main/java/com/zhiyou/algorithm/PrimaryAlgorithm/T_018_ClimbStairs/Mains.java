package com.zhiyou.algorithm.PrimaryAlgorithm.T_018_ClimbStairs;

public class Mains {

    private static int k = 0;


    public static void main(String[] args) {

        final long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(climbStairs(44));
        final long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println((end - start) / 1000);
    }

    public static int climbStairs(int n) {

        /*if (n == 1) {
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n - 1)+climbStairs(n - 2);*/
        if (n == 1) return 1;
        int sum[] = new int[n + 1];
        sum[0] = 0;
        sum[1] = 1;
        sum[2] = 2;
        for (int i = 3; i <= n; i++) {
            sum[i] = sum[i - 2] + sum[i - 1];
        }
        return sum[n];

    }


}
