public class SumofColumn {
    
   public static void main(String[] args) {
    int A[][] = new int[][] {
        {7,19,3},
        {4,21,0}
        // { 7, 9, 0, 2, 5 },
        // { 9, 8, 1, 0, 3 },
        // { 9, 0, 1, 2, 4 },
        // { 9, 7, 1, 2, 4 }
    };
    
    int largest = 0;
    for(int j=0;j<A[0].length;j++){
        int sum =0;
        for(int i=0;i<A.length;i++){ 
            sum=sum+A[i][j];
        }
        if(largest<sum){
            largest=sum;
            System.out.println(largest);
        } 

    }

    System.out.println("Largest Sum of the Columns : "+ largest);
   }
}
