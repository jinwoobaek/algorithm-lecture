package com.study;

import com.study.recursivecall.RecursiveCall;
import com.study.sort.BubbleSort;
import com.study.sort.InsertionSort;
import com.study.sort.SelectionSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        RecursiveCall rc = new RecursiveCall();
        System.out.println(rc.factorial(5));

        ArrayList<Integer> dataList = new ArrayList<Integer>();

        for (int data = 0; data < 10; data++) {
            dataList.add(data);
        }

        System.out.println(rc.sum(dataList));

        System.out.println(rc.practice(5));

    }
}
