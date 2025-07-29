package streamQuestion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question9_10_12 {
    public static void main(String[] args) {
        String str="iindiiia";

        //find the frist non-repeated charactor
        Map<Character,Long> map=str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        Optional<Map.Entry<Character, Long>> filterMap=map.entrySet()
                .stream().filter(k-> k.getValue()==1).findFirst();
        filterMap.ifPresent(System.out::println);

        //find the frequency of alphbet
        str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(m->System.out.print(m.getKey()+"="+m.getValue()+" "));
    }
}
