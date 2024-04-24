package com.leetcode.task.medium.range_sum_query_mutable;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1, 3, 5});   // [1, 3, 5]
        System.out.println(numArray.sumRange(0, 2));  //  9
        numArray.update(1, 2);                        // [1, 2, 5]
        System.out.println(numArray.sumRange(0, 2));  //  8

    }

    static class NumArray {
        private List<Integer> array = new ArrayList<>();
        private int sum = 0;

        public NumArray(int[] nums) {
            for (int num : nums) {
                array.add(num);
                sum += num;
            }
        }

        public void update(int index, int val) {
            sum = sum + val - array.get(index);
            array.set(index, val);
        }

        public int sumRange(int left, int right) {
            int result = sum;
            for (int i = 0; i < left; i++) {
                result = result - array.get(i);
            }
            for (int i = right + 1; i < array.size(); i++) {
                result = result - array.get(i);
            }
            return result;
        }
    }

//    static class NumArray {
//        private final int[] nums;
//
//        public NumArray(int[] nums) {
//            this.nums = nums;
//        }
//
//        public void update(int index, int val) {
//            this.nums[index] = val;
//        }
//
//        public int sumRange(int left, int right) {
//            int sum = 0;
//            for (int i = left; i <= right; i++) {
//                sum += this.nums[i];
//            }
//            return sum;
//        }
//    }
}