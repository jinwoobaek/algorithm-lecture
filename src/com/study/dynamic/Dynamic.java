package com.study.dynamic;

import java.util.Arrays;

public class Dynamic {
    public int fibonacci(int data) {
        Integer[] cache = new Integer[data + 1];
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < cache.length; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
    return cache[data];
    }
}
