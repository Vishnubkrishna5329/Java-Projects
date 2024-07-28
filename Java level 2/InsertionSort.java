public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 29, 1, 87, 34, 52, 16, 27, 14, 14 };
        insertionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1, temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
