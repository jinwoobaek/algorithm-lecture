package com.study;

import com.study.sort.BubbleSort;
import com.study.sort.SelectionSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            testData.add((int) (Math.random() * 100));
        }
        SelectionSort sSort = new SelectionSort();
        sSort.sort(testData);

    }
}
