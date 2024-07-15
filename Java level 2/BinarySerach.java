public class BinarySerach {

    static int searchElement(int [] nums, int target){
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left= mid+1;
            }else{
                right= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = new int[]{1,3,6,19,26,48,52,71,80};
        int target = 3;
        int index = searchElement(A, target);
        System.out.println(index); 
    }
    
}
