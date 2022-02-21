package com.study.recursivecall;

import java.util.ArrayList;

public class RecursiveCall {
    public int factorial(int num) {
        /*
         * 일반적인 형태 1
         * */
//        if (num > 1) {
//            return num * this.factorial(num - 1);
//        } else {
//            return num;
//        }

        /*
         * 일반적인 형태 2
         * */
        if (num <= 1) {
            return num;
        } else {
            return num * this.factorial(num - 1);
        }
    }

    public int sum(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.remove(0) + sum(dataList);
    }

    public int practice(int num) {
        if (num == 1) return 1;
        if (num == 2) return 2;
        if (num == 3) return 4;
        return this.practice(num - 1) + this.practice(num - 2) + this.practice(num - 3);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return this.fibonacci(n - 1) + this.fibonacci(n - 2);
    }
}
