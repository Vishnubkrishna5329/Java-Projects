import java.util.Scanner;

public class LinearSerach {

    public static int search(int element,int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[]{5,7,1,2,33,90,87,54,12,34,78};
        System.out.println("Enter the element to be serached");
        int element = sc.nextInt();
        int index= search(element,A);
        if(index==-1){
            System.out.println("Element : "+element+" not found");
        }else{
            System.out.println("Element : "+element+" is available in index "+index);
        }
        sc.close();
    }
}