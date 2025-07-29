package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question15 {
    public static void main(String[] args) {
        // Flatten a list of lists of integers into a single list of integers
        List<List<Integer>> listLists=List.of(
                List.of(1,2,3),
                List.of(4,5),
                List.of(6,7)
        );
        List<Integer> list=listLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(list);
    }
}
