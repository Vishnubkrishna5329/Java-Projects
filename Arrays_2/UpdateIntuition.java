package Arrays_2;

import java.util.Scanner;

public class UpdateIntuition {

    private static int takeInput(String msg, Scanner sc) {
        System.out.println(msg);
        return sc.nextInt();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = takeInput("Enter the capacity", sc);
        int size = takeInput("Enter how many elements need to be entered", sc);
        int[] A = new int[capacity];

        for (int i = 0; i < size; i++) {
            A[i] = takeInput("Enter the element in " + i + "th index : ", sc);
        }

        int key = takeInput("Enter the element need to be updated", sc);
        int newKey = takeInput("Enter the new value for update", sc);
        printData("Actual array : ", A);
        updateValue(A, size, key, newKey);
        printData("Expected array : ", A);
        sc.close();

    }

    private static void printData(String msg, int[] A) {
        System.out.println(msg);
        for (int value : A) {
            System.out.print(value + " ");
        }
    }

    private static void updateValue(int[] a, int size, int key, int newKey) {
        for (int i = 0; i < size; i++) {
            if (a[i] == key) {
                a[i] = newKey;
                break;
            }
        }
    }
}
