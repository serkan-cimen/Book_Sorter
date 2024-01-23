import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSet = new TreeSet<>();

        Book book1 = new Book("Beşinci Disiplin", 432, "Peter M. Senge", "1991");
        Book book2 = new Book("Üçüncü Dalga", 542, "Alvin Toffler", "2008");
        Book book3 = new Book("Goriot Baba", 319, "Honoré de Balzac", "1835");
        Book book4 = new Book("Büyük Plan Şah Mat", 192, "Ercan Faraş", "2020");
        Book book5 = new Book("Masal Masal İçinde", 143, "Ahmet Ümit", "2019");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book : bookSet) {
            System.out.println(book.toString());
        }

        System.out.println();

        TreeSet<Book> bookSet2 = new TreeSet<>(new PageNumberComparator());


        bookSet2.add(book1);
        bookSet2.add(book2);
        bookSet2.add(book3);
        bookSet2.add(book4);
        bookSet2.add(book5);

        for (Book book : bookSet2) {
            System.out.println(book.toString());
        }
    }
}