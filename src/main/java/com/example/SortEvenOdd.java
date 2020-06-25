package com.example;

import java.util.ArrayList;
import java.util.List;

public class SortEvenOdd implements ISortEvenOdd {

    /*
     * Time Complexity: O(2n) which is similar to O(n),
     * because constants are ignored in Big O notations
     *
     * Space Complexity: O(n)
     */
    @Override
    public List<Integer> sort(List<Integer> list) {
        int length = list.size();
        List<Integer> resultList = new ArrayList<>(length);

        for (int value : list) {
            if (value % 2 != 0) { // if odd
                resultList.add(value);
            }
        }

        for (int value : list) {
            if (value % 2 == 0) { // if even
                resultList.add(value);
            }
        }
        return resultList;
    }
}
