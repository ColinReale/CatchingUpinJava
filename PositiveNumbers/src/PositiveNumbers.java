import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {

    }

    public static List<Integer> positive(List<Integer> numbers){
//        utilizing the imported Collectors to perform a reduction operation.
        ArrayList<Integer> getPositiveNumbers = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new ));

        return getPositiveNumbers;





    }


}