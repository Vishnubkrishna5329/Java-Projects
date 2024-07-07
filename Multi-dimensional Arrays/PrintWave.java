public class PrintWave {
    
    public static void main(String[] args) {
        int[][] mat = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        if(mat.length==0){
			return;
		}
		
		int row =0;
        int count= 0;
		for(int i=0;i<mat[0].length;i+=2){
			
			for(int j= row;j<mat.length;j++){
				System.out.print(mat[j][i] +" ");
				row++;
                count++;
			}
			if(count != mat[0].length*mat.length){
                for(int j= row-1;j>=0;j--){
                    System.out.print(mat[j][i+1]+" ");
                    // System.out.print(i +" "+j);
                    row--;
                    count++;
                }
            }
			
		}
    }
}
