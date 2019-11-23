package com.zhiyou.algorithm.TI.T_075_SortColors;

public class Mains {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 0};
        test(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
    }


    /*
 荷兰三色旗问题解
 */
    public static void sortColors(int[] nums) {
        // 对于所有 idx < i : nums[idx < i] = 0
        // j是当前考虑元素的下标 210
        int p0 = 0, curr = 0;
        // 对于所有 idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 交换第 p0个和第curr个元素
                // i++，j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2) {
                // 交换第k个和第curr个元素
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            } else curr++;
        }
    }


    public static void test(int...nums){

        int p0=0;
        int cur=0;
        int p2=nums.length-1;

        while(cur<=p2){
            if(nums[cur]==0){
                nums[cur++]=nums[p0];
                nums[p0++]=0;
            }else if(nums[cur]==2){
                nums[cur]=nums[p2];
                nums[p2--]=2;
            }else{
                cur++;
            }
        }
    }


    //冒泡排序的最大特点是每一次的内层循环可以把最小的循环出来
    public static void sortColors1(int[] nums) {

        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void pr(int i, int j, int... nums) {
        System.out.println("i:" + i + "," + "j:" + j);
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }

}


