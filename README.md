# Median of Two Sorted Arrays

Given two sorted arrays (num1) and (num2) of size m and n respectively, return THE MEDIAN of the two sorted arrays.

The overall run time complexity should be O(log(m+n)).

Example 1:
    Input: nums1 = [1, 3], num2 = [2]
    Output: 2.0000
    Explanation: merged array = [1, 2, 3] and median is 2.

Example 2:
    Input: nums1 = [1, 2], num2 = [3, 4]
    Output: 2.50000
    Explanation: merged array = [1, 2, 3, 4] and median is (2 + 3)/ 2 = 2.5.

Constraints:
    nums1.length == m
    num2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -10⁶ <= nums1[i], nums2[i] <= 10⁶