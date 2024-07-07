public class SpiralIntuition {

    public static void main(String[] args) {
        
        int[][] matrix = new int[3][1];

        int rows = matrix.length - 1;
		int cols = matrix[0].length - 1;

		int top = 0, bottom = rows;
		int left = 0, right = cols;

		while (top <= bottom) {
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}

		}

        for(int[] i :matrix){
            for( int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
