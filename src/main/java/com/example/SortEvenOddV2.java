package com.example;

import java.util.ArrayList;
import java.util.List;

public class SortEvenOddV2 implements ISortEvenOdd {

    /*
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    @Override
    public List<Integer> sort(List<Integer> list) {
        int length = list.size();
        List<Integer> resultList = new ArrayList<>(length);
        List<Integer> evenList = new ArrayList<>();

        for (int value : list) {
            if (value % 2 != 0) { // if odd
                resultList.add(value);
            } else {
                //even
                evenList.add(value);
            }
        }
        resultList.addAll(evenList);
        return resultList;
    }
}
