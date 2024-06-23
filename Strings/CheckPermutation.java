public class CheckPermutation {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(isPermutation(str1, str2));

    }

    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		
		if(str1.length()!=str2.length()){
			return false;
		}
		int[] arr = new int[128];
		for(int i=0;i<str1.length();i++){
			arr[str1.charAt(i)]+=1;
		}
		for(int i=0;i<str1.length();i++){
			arr[str2.charAt(i)]-=1;
		}
		boolean isPermutation = true;

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				return false;
			}
		}
		return isPermutation;
	}
}
