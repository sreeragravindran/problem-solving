package problemsolving.binarySearch;

/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 */

public class RotatedSortedArray {

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private static int search(int[] nums, int start, int end, int target) {
        if (start >= end) {
            return -1;
        }

        int mid = start + ((end - start) / 2);

        if (target == nums[start]) {
            return start;
        }

        if (target == nums[end]) {
            return end;
        }

        if (target == nums[mid]) {
            return mid;
        }

        if (nums[start] < nums[mid] && target > nums[start] && target < nums[mid]) {
            return search(nums, start + 1, mid - 1, target);
        }

        if (nums[mid] < nums[end] && target > nums[mid] && target < nums[end]) {
            return search(nums, mid + 1, end - 1, target);
        }

        if (nums[start] > nums[mid]) {
            return search(nums, start + 1, mid - 1, target);
        }

        if (nums[mid] > nums[end]) {
            return search(nums, mid + 1, end - 1, target);
        }

        return -1;
    }
}
