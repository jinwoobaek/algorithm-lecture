package com.study.sort;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {
        int lowest;
        for (int stand = 0; stand < dataList.size() - 1; stand++) {
            lowest = stand;

            for (int i = stand + 1; i < dataList.size(); i++) {
                if (dataList.get(lowest) > dataList.get(i)) {
                    lowest = i;
                }
            }
                Collections.swap(dataList, lowest, stand);
        }
        return dataList;
    }
}
