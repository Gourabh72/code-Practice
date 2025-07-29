package streamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question19 {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(

                "Java 8 introduced streams",

                "Streams are powerful",

                "Use streams to process data"

        );


        Set<String> uniqueWords = sentences.stream()
                .map(sentence -> sentence.split(" ")) // Split each sentence into words
                .flatMap(Arrays::stream) // Flatten the stream of arrays into a stream of words
                .map(String::toLowerCase) // Convert words to lowercase for uniqueness
                .collect(Collectors.toSet()); // Collect unique words into a set


        uniqueWords.forEach(System.out::println);
    }
}
