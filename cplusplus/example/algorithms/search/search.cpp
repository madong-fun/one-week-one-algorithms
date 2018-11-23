//
// Created by 马东 on 2018/11/23.
//

#include "search.h"

search::search() {}
search::~search() {}

int search :: binary_search(int *array, int item,int size){
    int low = 0;
    int high = size - 1;
    while (low <= high) {
        int mid = (low + high) / 2 ;
        if (array[mid] == item) {
            return mid;
        }
        if (array[mid] > item) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
};
