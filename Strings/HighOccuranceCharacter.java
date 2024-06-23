public class HighOccuranceCharacter {
    
    public static void main(String[] args) {
		String str ="aabbbc";
		char ch = 'a';
		int[] arr = new int[128];
		int maxFreq = 0;
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)]+=1;
			maxFreq = Integer.max(maxFreq, arr[str.charAt(i)]);
		}
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]==maxFreq){
				ch =str.charAt(i);
			}
		}
		System.out.println(ch);
    }
}
