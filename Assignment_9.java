import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

public class Assignment_9 {

    public static Vector<Integer> buildSuffixArray(String s) {
        int n = s.length();
        Vector<Integer> suffixes = new Vector<>();
        for (int i = 0; i < n; i++) {
            suffixes.add(i);
        }

        Collections.sort(suffixes, (a, b) -> s.substring(a).compareTo(s.substring(b)));

        return suffixes;
    }

    public static void printSuffixes(String s, Vector<Integer> suffixArray) {
        for (int index : suffixArray) {
            System.out.println(index + " " + s.substring(index));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Vector<Integer> suffixArray = buildSuffixArray(input);

        System.out.println("Suffix Array in chronological order:");
        printSuffixes(input, suffixArray);

        scanner.close();
    }
}
