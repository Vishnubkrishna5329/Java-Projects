public class FindClosestIndex {
    public static void main(String[] args) {
        int [] nums = new int[]{6 ,7 ,11 ,13 ,21, 44 ,46};
        int target = 22;
        int left =0;
        int right = nums.length-1;

        
        while(left+1<right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                System.out.println(mid); ;
            } else if(nums[mid]<target){
                left= mid;
            }else{
                right= mid;
            }
        }
       if((target-nums[left])>(nums[right]-target)){
          System.out.println(right); ;
        }else{
            System.out.println(left);
        }
    }

}

