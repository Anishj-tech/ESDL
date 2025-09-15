import java.util.Scanner;

public class pattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask the user for number of rows
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int j = num;
            while (j > i) {
                System.out.print(" ");
                j--;
            }

            int k = i;
            while (k >= 1) {
                System.out.print(k);
                k--;
            }
            int l = 2;
            while (l <= i) {
                System.out.print(l);
                l++;
            }

            System.out.println();
        }

        sc.close();
    }
}
