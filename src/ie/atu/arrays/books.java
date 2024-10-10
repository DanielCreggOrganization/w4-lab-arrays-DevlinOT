package ie.atu.arrays;
class Book {
    private String name;
    private String author;

    // Constructor
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // Getter methods
    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }
}
public class books {
    public static void main(String[] args) {
    
   

    Book[] books = new Book[2];

        books[0] = new Book("To Kill a Mockingbird", "Harper Lee");
        books[1] = new Book("1984", "George Orwell");

        for (Book book : books) {
            System.out.println("Title: " + book.getName() + ", Author: " + book.getAuthor());
        }
    }
}


    
        
