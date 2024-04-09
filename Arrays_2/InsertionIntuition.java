package Arrays_2;

import java.util.Scanner;

public class InsertionIntuition {

    // Inserting an element in specific index

    private static int takeInput(String msg, Scanner sc) {
        System.out.println(msg);
        return sc.nextInt();
    }

    private static int insert(int[] a, int size, int index, int element) {
        for (int i = size; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = element;
        size++;
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
        int capacity = takeInput("Enter the capacity", sc);
        int size = takeInput("Enter how many elements need to be entered", sc);
        int[] A = new int[capacity];

        for (int i = 0; i < size; i++) {
            A[i] = takeInput("Enter the element in " + i + "th index : ", sc);
        }

        int element = takeInput("Enter the element to be inserted : ", sc);
        int index = takeInput("Enter the index number where the element " + element + " to be inserted : ", sc);

        printData("Actual array : ", A);
        size = insert(A, size, index, element);
        printData("Updated array : ", A);
        sc.close();

    }

}