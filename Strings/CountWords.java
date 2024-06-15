
public class CountWords {

    public static void main(String[] args) {
        
        int count =1;
        String s1 = "An apple a day, keeps the doctor away";   

        //Method 1  using charAt
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);

        //Method 2 using split
        count =1;
        String[] s2=s1.split(" ");
        System.out.println(s2.length);




    }

 
}