#!/usr/bin/env python3


def binary_search(list, item):
    low = 0
    high = len(list) - 1

    while low <= high:
        mid = (low + high) // 2
        if item == list[mid]:
            return mid
        if list[mid] < item:
            low = mid + 1
        else:
            high = mid - 1
    return None


if __name__ == '__main__':
    list = [1, 3, 5, 7, 8, 9, 10]
    print(binary_search(list, 5))
