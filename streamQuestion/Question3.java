package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        list.add(1);list.add(5);

        //find duplicate element
        list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1)
                .forEach(System.out::println);

        //frequency of number
        list.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                .entrySet().forEach(System.out::println);
    }
}
