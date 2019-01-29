# Two Sum

## 描述

```txt
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


 

```

## 题解

```go
利用hashMap 建立一个坐标和数值的关系，再来一遍轮询结束。
```