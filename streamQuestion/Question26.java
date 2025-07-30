package streamQuestion;

import java.util.List;
import java.util.stream.Stream;

public class Question26 {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,3,4,5,6,7);
        List<Integer> list2=List.of(1,3,5,7,9,11);

        //'Merge' two lists of integers and 'remove duplicates'
        Stream<Integer> marge=Stream.concat(list2.stream(),list1.stream()).distinct();
        marge.forEach(System.out::print);

        System.out.println();
        //find the common value
        if (list1.size()>list2.size())
                list1.stream().filter(x-> list2.contains(x)).forEach(System.out::print);
        else
                list2.stream().filter(x-> list1.contains(x)).forEach(System.out::print);
    }
}
