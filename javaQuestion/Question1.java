package javaQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        Integer[] arr={3,2,1,5,8,5,3,7,9,2,4};

        //list of array acending order
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+":"+arr[i]);
        }

        //list of array descending order
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+":"+arr[i]);
        }

        //remove duplicate
        List<Integer> list=List.of(arr);
        Set<Integer> set=list.stream().collect(Collectors.toSet());
        System.out.println(set);


    }
}
