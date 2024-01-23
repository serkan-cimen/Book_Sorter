public class Book implements Comparable<Book>{
    private final String name;
    private final int pageNumber;
    private final String author;
    private final String date;

    public Book(String name, int pageNumber, String author, String date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.date = date;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String toString() {
        return "Name: " + name +
                "\nAuthor: " + author +
                "\nDate: " + date +
                "\nPage: " + pageNumber +
                "\n************************";
    }
}
