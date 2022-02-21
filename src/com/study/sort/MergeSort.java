package com.study.sort;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> mergeSplit(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        left = this.mergeSplit(new ArrayList<Integer>(dataList.subList(0, dataList.size() / 2)));
        right = this.mergeSplit(new ArrayList<Integer>(dataList.subList(dataList.size() / 2, dataList.size())));

        return this.merge(left, right);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> leftData, ArrayList<Integer> rightData) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // Case 1 : 양쪽 배열이 모두 있을 때,
        while (leftPoint < leftData.size() && rightPoint < rightData.size()) {
            if (leftData.get(leftPoint) < rightData.get(rightPoint)) {
                mergedList.add(leftData.get(leftPoint++));
            } else {
                mergedList.add(rightData.get(rightPoint++));
            }
        }

        // Case 2 : left 배열 남았을 때,
        while (leftPoint < leftData.size()) {
            mergedList.add(leftData.get(leftPoint++));
        }

        // Case 3 : right 배열 남았을 때,
        while (rightPoint < rightData.size()) {
            mergedList.add(rightData.get(rightPoint++));
        }

        return mergedList;
    }
}
