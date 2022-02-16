package com.study.sort;


import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        // i의 의미는 회차
        // 회차 당 마지막 값은 정렬 되는것이므로 회차를 거듭할수록 비교를 한번씩 적게 해도된다.
        for (int i = 0; i < dataList.size() - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < dataList.size() - 1 - i; j++) {
                if (dataList.get(j) > dataList.get(j + 1)) {
                    Collections.swap(dataList, j, j + 1);
                    swap = true;
                }

            }
            if (swap == false) {
                break;
            }
        }
        return dataList;
    }
}
