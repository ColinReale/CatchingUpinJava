import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {

    public static void main(String[] args) {
    }

    public static List<Book> readBooks(String file) {

        List<Book> books = new ArrayList<>();

        try {
            Files.lines((Paths.get(file)))
                    .map(row -> row.split(",")) //splits the row on the comma

                    .filter(parts -> parts.length >= 4) // if there are less than 4 parts are ignored. We don't want books with only partial information
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .forEach(Book -> books.add(Book)); //adds each Book to the arrayList books

        } catch (Exception error) {

            System.out.println("Error reading file" + error.getMessage());
        }

        return books;

    }

}