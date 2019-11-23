package com.zhiyou.algorithm.PrimaryAlgorithm.T_011_Rotate;

public class Mains {

    public static void main(String[] args) {
        int[][] a=new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(a);

    }

    public static void rotate(int[][] matrix) {

        int len=matrix.length;

        //先对角线反转
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len-i ; j++) {
                int tmp =matrix[i][j];
                matrix[i][j]=matrix[len-1-j][len-1-i];
                matrix[len-1-j][len-i-1]=tmp;
            }
        }

        //每一列反转
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <len/2 ; j++) {
                int tmp=matrix[j][i];
                matrix[j][i]=matrix[len-1-j][i];
                matrix[len-1-j][i]=tmp;
            }
        }
    }

}
