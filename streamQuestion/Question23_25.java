package streamQuestion;

import java.util.List;

public class Question23_25 {
    public static void main(String[] args) {
        //Find the sum of the squares of a list of integers
        List<Integer> list=List.of(1,2,3,4,5);
        Integer sumOfSquares=list.stream()
                .mapToInt(x-> x*x)
                .sum();
        System.out.println(sumOfSquares);

        //Find the 'product' of all elements in a list of 'integers'
        Integer product=list.stream().reduce(1,(x,y)->x*y);
        System.out.println(product.intValue());

    }
}
