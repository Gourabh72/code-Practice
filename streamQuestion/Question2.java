package streamQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);

        //even and odd number
        list.stream().collect(Collectors.groupingBy(n->n%2==0,Collectors.toList()))
                .entrySet().forEach(System.out::println);
        //false=[1, 3, 5, 7]
        //true=[2, 4, 6]

        //filtering greater then 5 num list
        list.stream().filter(f-> f>=5).collect(Collectors.toList())
                .forEach(System.out::print);
        // 5 6 7
    }
}
