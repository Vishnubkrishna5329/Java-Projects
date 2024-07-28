public class SelectionSort {

    public static void sortSelection(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int min= i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
                if(a[i]>a[min]){
                    int temp= a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
            int[] arr = new int[] { 10, 29, 1, 87, 34, 52, 16, 27, 14, 14 };
            sortSelection(arr);
            for (int a : arr) {
                System.out.print(a + " ");
            }
    }
}
