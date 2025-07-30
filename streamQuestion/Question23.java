package streamQuestion;

import java.util.List;

public class Question23 {
    public static void main(String[] args) {
        //Find the sum of the squares of a list of integers
        List<Integer> list=List.of(1,2,3,4,5,6);
        Integer sumOfSquares=list.stream()
                .mapToInt(x-> x*x)
                .sum();
        System.out.println(sumOfSquares);
    }
}
