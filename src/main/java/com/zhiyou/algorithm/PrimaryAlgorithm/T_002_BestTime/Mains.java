package com.zhiyou.algorithm.PrimaryAlgorithm.T_002_BestTime;

import java.util.*;

public class Mains {

    //使用map进行缓存
    private static Map<Integer,Integer> map=new HashMap<>();

    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
        //用来存储这个元素后面的每一个元素的值，因为最大利益还是后面的值加上当前值的标胶最大才行
        Set<Integer> set = new TreeSet<>();
        for (int j = 0; j < prices.length; j++) {
            set.add(loop2(prices, j));
        }
        return set.size() == 0 ? 0 : (int) set.toArray()[set.size()-1];
    }

    private static int loop2(int[] prices, int i) {
        if (i == prices.length - 1) {
            return 0;
        }
        //用来存储这个元素后面的每一个元素的值，因为最大利益还是后面的值加上当前值的标胶最大才行
        Set<Integer> set = new TreeSet<>();
        for (int j = i + 1; j < prices.length; j++) {
            //判断差值
            int value = prices[j] - prices[i];
            int max=map.get(j)==null?loop2(prices, j):map.get(j);
            set.add((value<0?0:value)+max);
            map.put(j,max);
        }
        return set.size() == 0 ? 0 : (int) set.toArray()[set.size()-1];
    }
}
