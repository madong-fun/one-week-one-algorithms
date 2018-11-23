package example.algorithms.search;

/**
 * Created by Ma Dong on 2018/11/20.
 * 查找
 */
public class Search {

    /**
     * 二分查找法 O(log n)
     *  输入： 有序列表
     * @param array
     * @param item
     * @return
     */
    public static int binarySearch(int[] array, int item){
        int low = 0;
        int high = array.length -1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (array[mid] == item){
                return mid;
            }
            if (array[mid] > item){
                high = mid -1;
            }else {
                low = mid + 1 ;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8, 9, 10};
        System.out.println(binarySearch(array,9));
    }
}
