package selectionsort;

public class SelectionSort {
    static int[] selectionSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 6, 2, 10, 99, 22, 34, 65};
        selectionSort(arr1);
        for (int e : arr1) {
            System.out.print(e + " ");
        }
    }
}
