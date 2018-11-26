//
// Created by 马东 on 2018/11/26.
//

#include "sort.h"
#include "iostream"
sort::sort() {};
sort::~sort() {};

/**
 * 选择排序
 * @param array
 * @param size
 */
void sort::select_sort(int *array,int size) {

    for (int i = 0; i <= size - 1; i++) {
        int k = i;

        for (int j = i+1; j <= size - 1; j++) {
            if(array[j] < array[k]) k = j;
        }
        // 交换
        if (k != i) swap(array[i],array[k]);
    }
}

/**
 * 冒泡排序
 * @param array
 * @param size
 */
void sort::bubble_sort(int *array, int size) {

    for (int i = 0; i < size ; ++i) {
        for (int j = 0; j < size-1 ; ++j) {
            if (array[j] > array[j+1]) exchange(array[j],array[j+1]);
        }
    }
}

void sort ::bubble_sort_pro(int *array, int size) {

    bool flag = false;
    for (int i = 0; i < size ; ++i) {
        for (int j = 0; j < size-1 ; ++j) {
            if (array[j] > array[j+1]) {
                exchange(array[j],array[j+1]);
                flag = true;
            }
        }
       
        // 假如 循环一次没有发生交换，说明已然有序，终止循环
        if (!flag){
            break;
        } else{
            flag = false;
        }
    }
}

void sort::swap(int &a, int &b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}

void sort::exchange(int &a, int &b) {
    a = a + b;
    b = a - b;
    a = a - b;
}
