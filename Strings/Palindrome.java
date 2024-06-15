public class Palindrome {
    
    public static void main(String[] args) {
        String s1 ="English";
        String s2 ="malayalam";
        String s3 = "abcdefdcba";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        
    }

    public static boolean isPalindrome(String str) {
		//Your code goes here
		int lm = 0;
		int rm = str.length()-1;
		while(lm<=rm){
			if(str.charAt(lm)!=str.charAt(rm)){
				return false;
			}
            lm++;
            rm--;
		}
		return true;
	}

    
}
