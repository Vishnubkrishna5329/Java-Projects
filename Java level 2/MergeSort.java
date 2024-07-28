public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 4, 7, 11,99,101 };
        int[] arr2 = new int[] { 7,8,15,46,54,82 };
        int arr3[]= mergeSort(arr1,arr2);
        for (int a : arr3) {
            System.out.print(a + " ");
        }
}

    private static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        int k=0,i=0,j=0;
    
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }
        return arr3;
    }
}
