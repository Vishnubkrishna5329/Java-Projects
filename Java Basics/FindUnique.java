public class FindUnique {

    public static int findUnique(int[] arr) {
        // Your code goes here
        
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            while (j < arr.length) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
                if (j == arr.length - 1) {
                    return arr[i];
                }
    
                j++;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 1, 6, 3, 6, 2 };
        // int num =arr[0];
        // int count =0;
        // for(int i=0;i<arr.length;i++){
        // count=0;
        // for(int j= i+1; j<arr.length;j++){
        // if(arr[i]==arr[j]){
        // count++;
        // break;
        // }
        // }
        // if(count==0 ){
        // num=arr[i];
        // break;
        // }
        // }
        System.out.println(findUnique(arr));
    }
}
