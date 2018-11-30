#!/usr/bin/env python3


def select_sort(array):
    for i in range(len(array)):
        k = i

        for j in range(i + 1, len(array)):

            if array[k] > array[j]:
                k = j
        if k != i:
            array[i], array[k] = array[k], array[i]


def buble_sort(array):
    for i in range(len(array)):

        for j in range(len(array) - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]


def buble_sort_pro(array):
    flag = False
    for i in range(len(array)):
        for j in range(len(array) - 1):
            if array[j] > array[j + 1]:
                array[j], array[j + 1] = array[j + 1], array[j]
                flag = True
        if flag:
            flag = False
        else:
            break


if __name__ == '__main__':
    array = [2, 1, 3, 6, 7, 8, 9, 10]
    buble_sort(array)

    for a in array:
        print(a)
