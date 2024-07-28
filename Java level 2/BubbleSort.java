public class BubbleSort {

    public static void sortBubble(int[] a) {
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 29, 1, 87, 34, 52, 16, 27, 14, 14 };
        sortBubble(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
