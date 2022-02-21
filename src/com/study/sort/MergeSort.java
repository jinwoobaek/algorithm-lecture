package com.study.sort;

import java.util.ArrayList;

public class MergeSort {
    public void split(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1)
            return;

        ArrayList<Integer> left = new ArrayList<>(dataList.subList(0, dataList.size() / 2));
        ArrayList<Integer> right = new ArrayList<>(dataList.subList(dataList.size() / 2, dataList.size()));

        System.out.println(left);
        System.out.println(right);
    }
}
