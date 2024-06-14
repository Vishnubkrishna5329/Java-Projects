public class TripletSum {
    
    public static void main(String[] args) {
        int[] arr = new int[]{5,5,4,4,5,4};
        int x = 13;
        int res =0;
        for(int i=0;i<=arr.length-3;i++){
            for(int j=i+1;j<=arr.length-2;j++){
                for(int k =j+1;k<=arr.length-1;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        res+=1;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
