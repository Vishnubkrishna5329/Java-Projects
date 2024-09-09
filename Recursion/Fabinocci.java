public class Fabinocci {
    

    public static int fabinocci(int n){
        if(n==1||n==0){
            return 1;
        }

        int n_1=fabinocci(n-1);
        int n_2= fabinocci(n-2);
        int output =n_1+n_2;
        System.out.print(output+" ");
        return output;
    }

    public static void main(String[] args) {
        fabinocci(5);
    }
}
