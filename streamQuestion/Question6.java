package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        //find the number which started with 1
        list.add(111);list.add(123);list.add(234);list.add(321);
        list.stream().filter(i-> String.valueOf(i).startsWith("1"))
                .forEach(e->System.out.print(e+" "));
        //find the number which ended with 1
        list.stream().filter(i-> String.valueOf(i).endsWith("1"))
                .forEach(e->System.out.print(e+" "));
    }
}
