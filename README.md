# find-element-array-sum-left-array-equal-sum-right-array
This is my solution to GeeksForGeeks problem - https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/

https://www.geeksforgeeks.org/find-element-array-sum-left-array-equal-sum-right-array/

Given, an array of size n. Find an element which divides the array in two sub-arrays with equal sum.

My solution at Demo.javva runs at O(n). It is performed in exactly maximum one pass of an array without any additional space requirement. So space complexity is O(1).

Examples:

Input : 1 4 2 5
Output : 2
Explanation : If 2 is the partition, 
      subarrays are : {1, 4} and {5}

Input : 2 3 4 1 4 5
Output : 1
Explanation : If 1 is the partition, 
 Subarrays are : {2, 3, 4} and {4, 5}
