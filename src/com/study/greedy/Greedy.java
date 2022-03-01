package com.study.greedy;

import java.util.Arrays;
import java.util.Comparator;

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

    // 배낭 가중치 문제 (Fractional Knapsack Problem)
    public void fractionalKnapsack(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0; // 해당 물건을 분할에서 담을때 몇프로 담겨있는지

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o2[1] / o2[0] - o1[1] / o1[0];
            }
        });

        for (int i = 0; i < objectList.length; i++) {
            if ((capacity - (double) objectList[i][0]) >= 0) {
                capacity -= (double) objectList[i][0];
                totalValue += (double) objectList[i][1];
                System.out.println("무게:" + objectList[i][0] + ", 가치:" + objectList[i][1]);

            } else {
                fraction = capacity / (double) objectList[i][0];
                totalValue += (double) objectList[i][1] * fraction;
                System.out.println("무게:" + objectList[i][0] + ", 가치:" + objectList[i][1] + ", 비율:" + fraction);
                break;
            }
        }
        System.out.println("totalValue = " + totalValue);
    }
}
