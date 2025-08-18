import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input size (must be odd)
        System.out.print("Enter an odd number for magic square size: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Magic square is only possible for odd numbers.");
            return;
        }

        int[][] magic = new int[n][n];

        int number = 1;
        int i = 0, j = n / 2;  // start from middle of top row

        while (number <= n * n) {
            magic[i][j] = number;
            number++;

            int newi = (i - 1 + n) % n;  // move up (wrap around)
            int newj = (j + 1) % n;      // move right (wrap around)

            if (magic[newi][newj] != 0) {
                i = (i + 1) % n;  // move down if occupied
            } else {
                i = newi;
                j = newj;
            }
        }

        // Print the magic square
        System.out.println("Magic Square of size " + n + ":");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
