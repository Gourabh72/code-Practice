package streamQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question7_11_14 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        //joint the list into comma sperate
        list.add("apple");list.add("banna");list.add("carry");list.add("date");
        String str=list.stream().collect(Collectors.joining(","));
        System.out.println(str);//apple,banna,carry,date

        //show length word list
        list.stream().collect(Collectors.groupingBy(String::length))
                .entrySet().forEach(System.out::println);
        //4=[date]
        //5=[apple, banna, carry]

        //show word with length
        list.stream().collect(Collectors.toMap(s-> s,String::length))
                .entrySet().forEach(System.out::println);
        //banna=5
        //date=4
        //apple=5
        //carry=5
    }
}
