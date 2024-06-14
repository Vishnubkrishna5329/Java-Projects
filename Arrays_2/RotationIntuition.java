public class RotationIntuition {

    public static void main(String[] args) {
        int[] A = new int[] { 2, 5, 6, 8, 9, 11, 2 };
        int[] B = new int[A.length];
        int rotationBy = 1;
        String direction = "LEFT";
        for (int i = 0; i < A.length; i++) {
            if (direction.equals("RIGHT")) {
                B[(i + rotationBy) % A.length] = A[i];
            } else {
                B[(i - rotationBy + A.length) % A.length] = A[i];
            }
        }

        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}