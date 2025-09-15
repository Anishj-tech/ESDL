import java.util.ArrayList;

public class Even_Odd {
    public static void main(String[] args) {

        ArrayList<Integer> myNumber = new ArrayList<>();
        myNumber.add(40);
        myNumber.add(45);
        myNumber.add(60);
        myNumber.add(90);
        myNumber.add(70);
        myNumber.add(36);
        myNumber.add(38);
        myNumber.add(11);
        myNumber.add(5);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = myNumber.size() - 1; i >= 0; i--) {

            int number = myNumber.get(i);

            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }

            myNumber.remove(i);
        }

        System.out.println("Even Numbers List: " + evenNumbers);
        System.out.println("Odd Numbers List: " + oddNumbers);
        System.out.println("Original List after removal: " + myNumber);
    }
}
