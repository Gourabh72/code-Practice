package streamQuestion;

import java.util.Random;
import java.util.stream.Stream;

public class Question22 {
    public static void main(String[] args) {
        //Generate an 'infinite sequence' of random numbers and 'print' the first 10
        Random random=new Random();
        Stream<Integer> ramdomNumber=Stream.generate(random::nextInt);
        ramdomNumber.filter(v-> v>0 && v>999999999).limit(10).forEach(System.out::println);
    }
}
