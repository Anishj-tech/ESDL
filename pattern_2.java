import java.util.Scanner;

public class pattern_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        // loop rows
        for (int i = 1; i <= num; i++) {
            // Inner loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Close the scanner 
        sc.close();
    }
}
