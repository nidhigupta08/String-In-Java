package program;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    // Constructor to initialize the Book attributes
    public Book(String title, String author, int yearPublished) {
        this.title = title; // 'this.title' refers to the instance variable 'title'
        this.author = author; // 'this.author' refers to the instance variable 'author'
        this.yearPublished = yearPublished; // 'this.yearPublished' refers to the instance variable 'yearPublished'
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + this.title); // Using 'this' to access instance variable 'title'
        System.out.println("Author: " + this.author); // Using 'this' to access instance variable 'author'
        System.out.println("Year Published: " + this.yearPublished); // Using 'this' to access instance variable 'yearPublished'
    }

    // Method to compare two Book objects
    public void compareBooks(Book otherBook) {
        if (this.yearPublished < otherBook.yearPublished) {
            System.out.println(this.title + " is older than " + otherBook.title);
        } else if (this.yearPublished > otherBook.yearPublished) {
            System.out.println(this.title + " is newer than " + otherBook.title);
        } else {
            System.out.println(this.title + " was published in the same year as " + otherBook.title);
        }
    }

    public static void main(String[] args) {
        // Creating two Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        // Using methods and 'this' keyword
        book1.displayInfo(); // Display information about book1
        book2.displayInfo(); // Display information about book2

        // Comparing books using the compareBooks method
        book1.compareBooks(book2); // Comparing books book1 and book2
    }
}
