package com.study.greedy;

public class Greedy {
    // 최소한의 동전 갯수를 찾는 문제
    public int minCoinCount(int num) {
        int result = 0;
        int remainder = num;

        while (remainder > 0) {
            if (remainder / 500 >= 1) {
                result += remainder / 500;
                remainder %= 500;
            } else if (remainder / 100 >= 1) {
                result += remainder / 100;
                remainder %= 100;
            } else if (remainder / 50 >= 1) {
                result += remainder / 50;
                remainder %= 50;
            } else {
                result += remainder;
                remainder %= 1;
            }
        }
        return result;
    }
}
