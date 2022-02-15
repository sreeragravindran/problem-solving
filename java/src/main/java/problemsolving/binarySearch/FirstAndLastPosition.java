//package problemsolving.binarySearch;
///*
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//
//Example 3:
//Input: nums = [], target = 0
//Output: [-1,-1]
//
//Constraints:
//0 <= nums.length <= 105
//-109 <= nums[i] <= 109
//nums is a non-decreasing array.
//-109 <= target <= 109
// */
//public class FirstAndLastPosition {
//
//    public int[] search(int[] nums, int target) {
//        return search(nums, 0, nums.length -1, target);
//    }
//
//    private static int[] search(int[] nums, int start, int end, int target) {
//        if (start >= end) {
//            return new int[] {-1, -1} ;
//        }
//
//        int mid = start + ((end - start) / 2);
//
//        if (nums[start] == target) {
//            return start;
//        }
//
//        if (nums[end] == target) {
//            return end;
//        }
//
//        if (nums[mid] == target) {
//            return mid;
//        }
//
//        if (nums[start] < nums[mid] && target > nums[start] && target < nums[mid]) {
//            return search(nums, start + 1, mid - 1, target);
//        }
//
//        if (nums[mid] < nums[end] && target > nums[mid] && target < nums[end]) {
//            return search(nums, mid + 1, end - 1, target);
//        }
//
//        if (nums[start] > nums[mid]) {
//            return search(nums, start + 1, mid - 1, target);
//        }
//
//        if (nums[mid] > nums[end]) {
//            return search(nums, mid + 1, end - 1, target);
//        }
//
//        return -1;
//    }
//
//    private int findFirstPosition(int[] nums, int foundIndex) {
//        while (foundIndex > 0) {
//            if(nums[foundIndex] == nums[foundIndex-1 ]) {
//                foundIndex--;
//            } else {
//                return foundIndex;
//            }
//        }
//        return foundIndex;
//    }
//
//    private int findLastPosition(int nums, int foundIndex) {
//        while (foundIndex < nums.) {
//            if(nums[foundIndex] == nums[foundIndex-1 ]) {
//                foundIndex--;
//            } else {
//                return foundIndex;
//            }
//        }
//        return foundIndex;
//    }
//}
