
public class PushZerosIntuition {

    public static void main(String[] args) {
        int[] A = new int[] { 0, 4, 0, 3, 0, 0, 2, 5 };
        int nz = 0;
        int z = 0;
        while (z <= A.length - 1) {

            if (A[z] != 0) {
                int temp = A[nz];
                A[nz] = A[z];
                A[z] = temp;
                nz++;
                z++;
            } else {
                z++;
            }

        }

        for (int i : A) {
            System.out.print(i + " ");
        }
    }

}
