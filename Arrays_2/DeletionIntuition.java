package Arrays_2;

import java.util.Scanner;

public class DeletionIntuition {

    private static int takeInput(String msg, Scanner sc) {
        System.out.println(msg);
        return sc.nextInt();
    }

    private static int deletion(int[] a, int size, int index, int element) {
        for (int i = index; i < size; i++) {
            a[i] = a[i + 1];
        }
        size--;
        return size;
    }

    private static void printData(String msg, int[] A) {
        System.out.println(msg);
        for (int value : A) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int capacity = takeInput("Enter the capacity", sc);
        int size = takeInput("Enter how many elements need to be entered", sc);
        int[] A = new int[capacity];

        for (int i = 0; i < size; i++) {
            A[i] = takeInput("Enter the element in " + i + "th index : ", sc);
        }

        int element = takeInput("Enter the element to be deleted : ", sc);
        index = findIndex(A, size, element);
        printData("Actual array : ", A);
        size = deletion(A, size, index, element);
        printData("Expected array : ", A);
        sc.close();

    }

    private static int findIndex(int[] a, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
