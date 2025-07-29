package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);list.add(11);list.add(1);list.add(12);list.add(13);
        list.add(9);list.add(8);
        Double avgDouble=list.stream().filter(v->v>=10)
                .collect(Collectors.averagingDouble(Integer::intValue));
        System.out.println(avgDouble);
    }
}
