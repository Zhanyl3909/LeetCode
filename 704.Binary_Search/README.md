# 704. Binary Search 

You must write an algorithm with `O(log n)` runtime complexity.

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return `-1`.

**Example 1:**

```
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

```

**Example 2:**

```
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

```

**Constraints:**

- `1 <= nums.length <= 104`
- `104 < nums[i], target < 104`
- All the integers in `nums` are **unique**.
- `nums` is sorted in ascending order.


### **Complexity Analysis**

Let nn*n* be the size of the input array `nums`.

- Time complexity: O(log⁡n)O(\log n)*O*(log*n*)
    - `nums` is divided into half each time. In the worst-case scenario, we need to cut `nums` until the range has no element, and it takes logarithmic time to reach this break condition.
- Space complexity: O(1)O(1)*O*(1)
    - During the loop, we only need to record three indexes, `left`, `right`, and `mid`, they take constant space.
