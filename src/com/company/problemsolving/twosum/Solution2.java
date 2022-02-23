package com.company.problemsolving.twosum;

import java.util.HashMap;
import java.util.Map;

 class Solution2 {
    //Using maps
    //one for loop for which is O(N) its only being traversed once
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(numbers[i], i);
        }

        return null;
    }
}
