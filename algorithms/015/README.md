# 3Sum

## 描述

```txt
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]


```

## 题解

```
三个数定义为 i k j。
首先将数组排序，i 为数组起始位置， j 为数组末尾位置 ，k 在i与j 之间。
i从前往后遍历，j从后往前遍历，i每次向后遍历一个j初始化。
为了保证不重复，nums[i] == nums[i -1] 和 nums[j] == nums[j+1] 这两种情况continue。
其中 k只要能选取到值，可以马上break节约时间。
这道题压着时间线过的，有较大的优化空间。
1.从算法上优化，用其他的办法。
2.在此方法上也有很多减少遍历步骤的办法。

```