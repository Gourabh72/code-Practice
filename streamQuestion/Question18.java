package streamQuestion;

import java.util.List;

public class Question18 {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8,9);
        //'Skip' first 5 elements in a list and 'print' rest
        list.stream().skip(5)
                .forEach(System.out::print);
    }
}
