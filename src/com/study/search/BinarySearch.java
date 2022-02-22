package com.study.search;

import java.util.ArrayList;

public class BinarySearch {
    public boolean search(ArrayList<Integer> dataList, int findData) {
        if (dataList.size() == 1 && dataList.get(0) == findData) {
            return true;
        }
        if (dataList.size() == 1 && dataList.get(0) != findData) {
            return false;
        }
        if (dataList.size() == 0) {
            return false;
        }

        int mid = dataList.size() / 2;

        if (dataList.get(mid) == findData) {
            return true;
        } else {
            if (findData < dataList.get(mid)) {
                return this.search(new ArrayList<>(dataList.subList(0, mid)), findData);
            }
            else {
                return this.search(new ArrayList<>(dataList.subList(mid + 1, dataList.size())), findData);
            }
        }
    }
}
