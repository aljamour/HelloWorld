package Uge11.LinkedIn.interfaces;

public class Library {

    public static void main(String[] args) {

        Product book = new Book();
        book.setName("The Sunnah of Rasul Allah SAW");

        Book book2 = new Book();
        book2.getPrice();

        book2.setAuthor("Mo Osman");

        System.out.println(book2.getAuthor());

    }

}
