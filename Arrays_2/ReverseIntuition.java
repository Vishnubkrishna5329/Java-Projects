package Arrays_2;

public class ReverseIntuition {
    

    private static void printData(int[] A){
        for(int a :A){
            System.out.print(a+" ");
        }
    }

    private static int[] reverseArray(int[] A){
        int lastIndex = A.length-1;
        int temp =0;
        for(int i=0;i<A.length/2;i++){
           temp= A[i];
           A[i]=A[lastIndex];
           A[lastIndex]=temp;
           lastIndex--;
        }
        return A; 
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("Before reverse : ");
        printData(A);
        reverseArray(A);
        System.out.println("After reverse : ");
        printData(A);
    }
}
