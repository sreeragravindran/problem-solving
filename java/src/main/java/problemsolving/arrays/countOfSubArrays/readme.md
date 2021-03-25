Count Subarrays with Consecutive elements differing by 1
Given an array arr[] of N integers. The task is to count the total number of subarrays of the given array such that difference between the consecutive elements in the subarrays is one. That is, for any index 

i in the subarrays, arr[i+1] – arr[i] = 1.

Note: Do not consider subarrays with single element.

Examples:

Input : arr[] = {1, 2, 3}
Output : 3
The subarrays are {1, 2}. {2, 3} and {1, 2, 3}

Input : arr[] = {1, 2, 3, 5, 6, 7}
Output : 6
The subarrays are {1, 2}. {2, 3} {1, 2, 3} {5,6} (6,7), {5,6,7}