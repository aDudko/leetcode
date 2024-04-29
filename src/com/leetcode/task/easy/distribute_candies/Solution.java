package com.leetcode.task.easy.distribute_candies;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 2, 3, 3})); // 3
        System.out.println(distributeCandies(new int[]{1, 1, 2, 3}));       // 2
        System.out.println(distributeCandies(new int[]{6, 6, 6, 6}));       // 1
    }

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();
        int canEat = candyType.length / 2;
        for (int i : candyType){
            if (types.size() >= canEat)
                return canEat;
            types.add(i);
        }
        return Math.min(canEat, types.size());
    }
}