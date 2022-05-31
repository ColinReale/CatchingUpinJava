import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ReadingFilesPerLine {

    public static void main(String[] args) {

    }

    public static List<String> read(String file){
        List<String> rows = new ArrayList<>();
//attempts to get the files with the names of the parameters.
        try{
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
//            if the file cannot be found,
        } catch (Exception error){
            System.out.println("Error reading file" + error.getMessage());
        }
        return rows;
    }

}