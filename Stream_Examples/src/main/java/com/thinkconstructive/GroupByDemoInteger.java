package com.thinkconstructive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemoInteger {
    public static void main(String args[]){
        List<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,
                4,5,6,4,5,6,7,8,4,5,6,7,8,9));

        Map<Integer, Long> mapOfNumbers = numberList.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );

        mapOfNumbers.forEach((listNumber, count) -> System.out.println(
                "Occurence of " + listNumber + " in the given list = " + count
        ));
    }
}
