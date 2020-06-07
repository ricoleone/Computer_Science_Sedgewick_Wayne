
public class TranposeNxN {
	public static void main(String[] args) {

        // create n-by-n matrix
        int n = Integer.parseInt(args[0]);
        char[][] a = new char[n][n];
        char base = '\21';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (char) (base*i + j);
            }
        }
        // print out initial matrix
        System.out.println("Before");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4s", a[i][j]);
            }
            System.out.println();
        }

        // transpose in-place
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = (char) temp;
            }
        }

        // print out transposed matrix
        System.out.println();
        System.out.println("After");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4s", a[i][j]);
            }
            System.out.println();
        }

    }

}
