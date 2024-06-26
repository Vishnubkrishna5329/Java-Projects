/**
 * Basic
 */
public class Basic {

    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6}};
        int[] result= printRowWise(A);
        for(int i :result){
            System.out.print(i+" ");
        }
    }

    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int limit =0;
        int[] result= new int[a.length*a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
               result[limit]=a[i][j];
               limit++;
            }
        }
        return result;
    }
}