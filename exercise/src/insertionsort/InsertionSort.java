package insertionsort;

public class InsertionSort {
    static int[] list = {5, 7, 10, 2, 4, 98, 12, 25};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println("List after the " + i + " sort: ");
            for (int e : list) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("List final: ");
        for (int e : list)
            System.out.print(e + "\t");
    }
}
