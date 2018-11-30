package example.algorithms.sort;

/**
 * Created by Ma Dong on 2018/11/30.
 */
public class Sort {

    public static void selectSort(int[] array){

        for (int i = 0; i < array.length ; i++) {

            int k = i;

            for (int j = i+1; j < array.length ; j++) {

                if (array[k] > array[j]){
                    k = j;
                }
            }

            if ( k != i){
                swap(array,k,i);

            }

        }

    }

    public static void bubleSort(int[] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length -1 ; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }

    }

    public static void bubleSortPro(int[] array){

        boolean flag = false;
        for (int i = 0; i <array.length ; i++) {

            for (int j = 0; j < array.length -1; j++) {
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                    flag = true;
                }
            }
            if (flag){
                flag = false;
            }else {
                break;
            }
        }
    }

    private static void swap(int[] array,int x ,int y){
        array[x] = array[x] ^ array[y];
        array[y] = array[x] ^ array[y];
        array[x] = array[x] ^ array[y];
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 7, 8, 9, 10};
        bubleSort(array);

        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
