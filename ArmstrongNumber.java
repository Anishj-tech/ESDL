import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;

        // Step 1: count number of digits
        int temp = num;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: calculate sum of digits^count
        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            // multiply digit 'count' times
            for (int i = 0; i < count; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        // Step 3: check Armstrong
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
