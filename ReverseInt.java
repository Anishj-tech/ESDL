import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        // Take digits from last and build reverse
        while (num > 0) {
            int digit = num % 10;           // get last digit
            reverse = (reverse * 10) + digit; // add digit to reverse
            num = num / 10;                 // remove last digit
        }

        System.out.println("Reversed number: " + reverse);
    }
}
