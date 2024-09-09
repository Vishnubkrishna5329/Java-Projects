public class Print1toN {
    
    public static void main(String[] args) {
        printNNaturalNumbers(10);
    }

    private static void printNNaturalNumbers(int n) {
        if(n==0){
            return;
        }
        printNNaturalNumbers(n-1);
        System.out.println(n);
    }
}
