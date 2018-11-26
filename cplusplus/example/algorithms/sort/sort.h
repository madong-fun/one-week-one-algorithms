#ifndef ONE_WEEK_ONE_ALGORITHMS_SORT_H
#define ONE_WEEK_ONE_ALGORITHMS_SORT_H


class sort {
public:
    sort();

    ~sort();

    void select_sort(int *array, int size); //选择排序

    void bubble_sort(int *array, int size);

private:
    void swap(int &a, int &b);

    void exchange(int &a, int &b);
};


#endif //ONE_WEEK_ONE_ALGORITHMS_SORT_H
