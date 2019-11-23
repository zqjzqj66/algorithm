package com.zhiyou.algorithm.TI.T_029_Divide;

public class Mains {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 1));
    }

    public static int divide(int dividend, int divisor) {
        //当d为0的时候
        if (dividend == 0) {
            return 0;
        }

        //解决正负问题
        boolean flag = true;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            flag = false;
        }


        long tempdivied = Math.abs((long) dividend);
        long tempdivior = Math.abs((long) divisor);

        long count = 0;

        while (tempdivied >=tempdivior) {
            long temp=tempdivior;
            long k=1;
            while(tempdivied>=temp){
                tempdivied=tempdivied-temp;
                count=count+k;
                temp=3*temp;
                k=3*k;
            }
        }

        if(flag){

            if(count>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                return (int)count;
        }else{
            return (int)(-count);
        }
    }


}
