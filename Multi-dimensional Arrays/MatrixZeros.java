public class MatrixZeros {

    public static void main(String[] args) {

        int A[][] = new int[][] {
            // {7,19,3},
            // {4,21,0}
                // { 7, 9, 0, 2, 5 },
                // { 9, 8, 1, 0, 3 },
                // { 9, 0, 1, 2, 4 },
                // { 9, 7, 1, 2, 4 }
                {1,0},{2,7},{3,0},{4,8},{3,3}
        };

        setZeros(A);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }



    }

    public static void setZeros(int matrix[][]) {

        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                    makeMinusOne(matrix, i, j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

    }

    private static  void makeMinusOne(int matrix[][],int row,int col){
        for(int j=0;j<matrix[0].length;j++){
           if(matrix[row][j]!=0){
            matrix[row][j]=-1;
           }
        }

        for(int j=0;j<matrix.length;j++){
            if(matrix[j][col]!=0){

             matrix[j][col]=-1;
            }
         }
    }
}