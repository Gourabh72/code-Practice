package streamQuestion;

import java.util.stream.Collectors;

public class Question4 {
    public static void main(String[] args) {
        String str="hello world";

        //remove the given charactor
        Character ch='l';

        String newStr=str.chars().filter(c-> c!=ch)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(newStr);

        // contain given charactor
        String givenStr=str.chars().filter(c-> c==ch || c==' '||c=='o')
                .mapToObj(c-> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(givenStr);
    }
}
