public class BinarySearch {
    
    public static int binarySearch(int[] arr, int si, int ei, int x){
        if(si>ei){
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==x){
            return x;
        }else if(arr[mid]>x){
            return binarySearch(arr, si, mid-1, x);
        }else{
            return binarySearch(arr, mid+1, ei, x);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,12,16,48,75,99};
        System.out.println(binarySearch(arr,0,arr.length-1,15));
    }
}
