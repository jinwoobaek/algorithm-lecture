package com.study.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList) {

        if (dataList.size() <= 1) return dataList;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        int pivot = dataList.get(0);

        for (int i = 1; i < dataList.size(); i++) {
            if (dataList.get(i) < pivot) {
                left.add(dataList.get(i));
            } else {
                right.add(dataList.get(i));
            }
        }

        ArrayList<Integer> mergedData = new ArrayList<>();
        mergedData.addAll(this.sort(left));
        mergedData.addAll(Arrays.asList(pivot));
        mergedData.addAll(this.sort(right));

        return mergedData;
    }
}
