public class ReverseEachWord {

    
    public static void main(String[] args) {
        String str = "the second test case is a collection of palindromes"
        ;
        String reverseWord ="";
        String finalString ="";

        int start =0;
        int end =0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' ' || i==str.length()-1 ){
                if(i==str.length()-1){
                    end =i;
                }else{
                    end = i-1;
                }
                reverseWord= reverseString(str,start,end);
                finalString = finalString + reverseWord+ " ";
                start= i+1;
            }
        }
            System.out.println(finalString);
    }

    private static String reverseString(String str, int start, int end) {
        
        String revString = "";
        for(int i= end;i>start;i--){
            revString = revString +str.charAt(i);
        }
        //System.out.println(revString);
        return revString;
       
    }
}