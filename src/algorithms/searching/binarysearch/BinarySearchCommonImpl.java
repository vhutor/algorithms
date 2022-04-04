package algorithms.searching.binarysearch;

/**
 * Here is a common implementation for the binary search algorithm.
 *
 * Exercise: Given an array of integers nums which is sorted in ascending order, and an integer target,
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Link to source: https://leetcode.com/explore/learn/card/binary-search/138/background/1038/
 * **/

public class BinarySearchCommonImpl {
    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int pivot;
        while(begin <= end) {
            pivot = begin + (end - begin) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) end = pivot - 1;
            else begin = pivot + 1;
        }
        return -1;
    }
}
