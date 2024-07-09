import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLeaders {

    public static void main(String[] args) {
        int[] input = new int[]{3 ,12, 34, 2,34, 0, -1,};
        List<Integer> leadersList = new ArrayList<>();

		
		for(int i=0;i<input.length;i++){
			int count = 0 ;
			for(int j=i+1;j<input.length;j++){
				if(input[i]>=input[j]){
					count++;
				}else{
                    break;
                }
			}
			
			if(count+i==input.length-1){
				leadersList.add( input[i]);
			}
		}

		Arrays.sort(leadersList.toArray());
		for(int i =leadersList.size()-1; i>=0;i--){
			System.out.print(leadersList.get(i)+" ");
		}
    }
}
