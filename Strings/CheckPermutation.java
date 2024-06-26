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
		//ASCII characters range 
		int[] arr = new int[128];
		for(int i=0;i<str1.length();i++){
			arr[str1.charAt(i)]+=1;
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

// 	In total, there are 256 ASCII characters, and can be broadly divided into three categories:

// ASCII control characters (0-31 and 127)
// ASCII printable characters (32-126) (most commonly referred to)
// Extended ASCII characters (128-255)
}
