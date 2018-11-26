# one-week-one-algorithms

## 一周一算法
### 第一周：二分查找法
### 第二周：选择排序 与 冒泡排序
  1. 选择排序：扫描整张表,找出最小的数与第一个进行交换，将最小的元素放到有序表最终的位置上，依次类推
  2. 冒泡排序：依次比较相邻的两个数，如果逆序，交换位置，重复多次以后，可以达到有序状态
  对于任何输入来说，选择排序算法的时间效率都是O(n2),但是其交换次数是n-1；冒泡排序交换次数与比较次数是相同的；改进版冒泡排序，当循环一次没有发生交换时，说明序列已经有序，中止循环，但是其极端情况下依然是O(n2)
