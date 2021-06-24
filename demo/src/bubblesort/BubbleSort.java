package bubblesort;

public class BubbleSort {
    static int[] bubblelSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped = false)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 6, 2, 10, 99, 22, 34, 65};
        bubblelSort(arr1);
        for (int e : arr1) {
            System.out.print(e + " ");
        }
    }
}
