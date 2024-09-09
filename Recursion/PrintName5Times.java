public class PrintName5Times {
    

   
    public static void main(String[] args) {
        print("Vishnu B",5);
    }

    private static void print(String string, int i) {
        if (i==0){
            return;
        }
        print(string, i-1);
        System.out.println(string);
    }
}
