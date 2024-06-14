public class ArrayRotation {
    
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
         if(x>a.length){
             x= x%a.length;
         }
            int l =0;
            int r = a.length-1;
            int len = a.length;
        if(dir.equals("RIGHT")){
            //Step 1 : Reverse Array
            swapArray(l,r,a);
            //Step 2:  Reverse sub array from 0 to x-1
            swapArray(0,x-1,a);
             //Step 3:  Reverse sub array from x to len-1
             swapArray(x,len-1,a);
        }else{
              //Step 1 : Reverse Array
            swapArray(0,len-1,a);
            //Step 2:  Reverse sub array from 0 to len-x-1
            swapArray(0,len-x-1,a);
             //Step 3:  Reverse sub array from len-x to len-1
             swapArray(len-x,len-1,a);

        }
           
       return a;
       

    }

    public static void swapArray(int l, int r, int[]a){
        while(l<r){
           int temp = a[l];
           a[l] = a[r];
           a[r] = temp;
           l++;
           r--;
       }
    }

    public static void main(String[] args) {
        String dir ="LEFT";
        int x =6;
        int[] a= new int[]{20 ,6, 9, 68 ,61};
        rotateArray(a, x, dir);
        for(int i : a){
            System.out.print(i+ " ");
        }

    }
}
// 5
// 5 6 LEFT
// 20 6 9 68 61 
// 3 4 RIGHT
// 85 65 51 
// 2 8 RIGHT
// 98 83 
// 3 4 LEFT
// 38 98 40 
// 7 10 LEFT
// 52 11 77 98 41 89 97 
