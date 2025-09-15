import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0; 
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; 
    }

   
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the title of the book: ");
        String title1 = scanner.nextLine();
        Book book1 = new Book(title1);

 
        System.out.print("Enter the title of the book: ");
        String title2 = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author2 = scanner.nextLine();
        Book book2 = new Book(title2, author2);


        System.out.print("Enter the title of the book: ");
        String title3 = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String author3 = scanner.nextLine();
        System.out.print("Enter the price of the book: ");
        double price3 = scanner.nextDouble();
        Book book3 = new Book(title3, author3, price3);

       
        System.out.println("\nBook 1:");
        book1.displayDetails();
        System.out.println("\nBook 2:");
        book2.displayDetails();
        System.out.println("\nBook 3:");
        book3.displayDetails();

        scanner.close();
    }
}
