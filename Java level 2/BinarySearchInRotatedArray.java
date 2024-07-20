public class BinarySearchInRotatedArray {

    public static int search(int[] nums, int target) {
        int rotateX = 0;
        // boolean found= false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                rotateX = i + 1;
                break;
            }
        }
        int left =0;
        int right = nums.length-1;
        if(target>=nums[rotateX] && target<=nums[right]){
            left = rotateX;
        }else{
            right = rotateX-1;
        }
        if(nums[left]==target){
            return left;
        } 
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right= mid-1;
            }else{
                left= mid+1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] input = new int[]{4};
        int target =7;
        System.out.println(search(input,target));
    }
}
