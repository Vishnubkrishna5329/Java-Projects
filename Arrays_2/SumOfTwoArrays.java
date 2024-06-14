public class SumOfTwoArrays {
    

    public static void main(String[] args) {
        int[] arr1= new int[]{6,9,8,5};
        int[] arr2 = new int[]{0};
        int len = 0;

        if(arr1.length>arr2.length){
            len = arr1.length+1;
        }else {
            len = arr2.length+1;
        }

        int[] output = new int[len];

        sumOfTwoArrays(arr1, arr2, output);

        for(int i :output){
            System.out.print(i+" ");
        }
    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = output.length-1;
        int carry = 0;
        
        while(i>=0 &&j>=0){
            output[k]= (arr1[i]+arr2[j]+carry)%10;
            carry = (arr1[i]+arr2[j]+carry)/10;
            i--;
            j--;
            k--;    
        }

        if(arr1.length>arr2.length){
            //i = arr1.length-1;
            while(i>=0){
                output[k]= (arr1[i]+carry)%10;
                carry = (arr1[i]+carry)/10;
                i--;
                k--;
            }
        }else{
           // j = arr2.length-1;
            while(j>=0){
                output[k]= (arr2[j]+carry)%10;
                carry = (arr2[j]+carry)/10;
                j--;
                k--;
            }
        }

        output[k]=carry;
    }
}
