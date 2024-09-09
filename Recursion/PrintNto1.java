public class PrintNto1 {
    

    public static void main(String[] args) {
        //printNto1(10);
        printNto1Method2(10);
    }

    private static void printNto1Method2(int i) {
      if(i==0){
        return;
      }
      printNto1Method2(i+1);
      System.out.println(i);
    }

    private static void printNto1(int n) {
      if(n==0){
        return;
      }
      System.out.println(n);
      printNto1(n-1);

    }
}
