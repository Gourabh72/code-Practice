package streamQuestion;

import java.util.stream.Collectors;

public class Question5 {
    public static String findSpecialCharactor(String str){
        return str.chars().filter(c-> !Character.isAlphabetic(c))
                .mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
    public static void main(String[] args) {
        String str="Hello world!";
        String specialCharctor=findSpecialCharactor(str);
        System.out.println(specialCharctor);
    }
}
