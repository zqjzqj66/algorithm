package com.zhiyou.algorithm.PrimaryAlgorithm.T_007_NumArray;

import java.util.Arrays;

public class Mains {


    public static void main(String[] args) {
        int[] ints = plusOne(9);

        Arrays.stream(ints).forEach(System.out::print);

    }

    public static int[] plusOne(int... digits) {


        int i = 0;
        int k = 1;

        reserve(digits, 0, digits.length - 1);
        while (i >= 0) {
            int value = digits[i] + k;
            if (value >= 10) {
                digits[i] = value % 10;
                k = value / 10;
                i++;
                if (i == digits.length) {
                    int[] data = new int[digits.length + 1];
                    System.arraycopy(digits, 0, data, 1, digits.length);
                    data[i]=1;
                    digits=data;
                    break;
                }
            } else {
                digits[i] = value;
                break;
            }
        }

        reserve(digits, 0, digits.length - 1);
        return digits;
    }

    private static void reserve(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
