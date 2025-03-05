package Uge5.encapsulation.constructors.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("How To Java 2025");
        book.setAuthor("Alan Al-Jamour");
        book.setPrice(354.95);

        System.out.println(book.getPrice());
        book.applyDiscount(35);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
    }
}