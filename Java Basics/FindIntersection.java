public class FindIntersection {
    public static void main(String[] args) {
        int arr1[]= {10,10};
        int arr2[]= {10};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]&& (arr1[i]!=0)&&(arr2[j]!=0)){
                    System.out.print(arr1[i]+" ");
                    arr1[i]=0;
                    arr2[i]=0;
                }
            }
        }
    }
}
