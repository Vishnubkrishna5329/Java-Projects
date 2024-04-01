
public class MemoryAllocation {

    public static void main(String[] args) {

        int[] A = {1,2,8,15,660,5};
        int[] B = A;
        int[] C = new int[]{1,2,8,15,660,5};
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        String[] D = {"abc","def"};
        System.out.println(D); 

        double[] E = {2.4,565,89.88};
        System.out.println(E);

        float[] F = {2.4f,565f,89.88f};
        System.out.println(F);

        long[] G = {12l,656l,5454l};
        System.out.println(G);

        boolean[] H = {true,false};
        System.out.println(H); 

        short[] I = {12,15};
        System.out.println(I);
        
        byte[] J = {1,5};
        System.out.println(J);


// [I@15db9742 int
// [I@15db9742 int
// [I@6d06d69c int
// [Ljava.lang.String;@7852e922 String
// [D@4e25154f double
// [F@70dea4e float
// [J@5c647e05 long
// [Z@33909752 boolean
// [S@55f96302 short
// [B@3d4eac69 byte
    }
}
