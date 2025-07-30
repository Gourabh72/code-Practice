package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question20 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");list.add(null);list.add("two");list.add(null);list.add("three");

//        Filter out 'null values' from a list of strings
        list.stream().filter(v-> v!=null).forEach(System.out::println);


    }
}
