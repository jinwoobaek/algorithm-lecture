package com.study;

import com.study.search.BinarySearch;
import com.study.sort.MergeSort;
import com.study.sort.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        ArrayList<Integer> dataList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 7, 8, 9, 10));

        System.out.println(bs.search(dataList, 80));
    }

}
