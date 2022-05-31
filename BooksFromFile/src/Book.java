public class Book {

    private int pageCount;
    private int publishingYear;
    private String author;
    private String name;
    public Book(String name, int ReleaseYear, int pages, String author) {
        this.pageCount = pages;
        this.name = name;
        this.author = author;
        this.publishingYear = ReleaseYear;
    }


}