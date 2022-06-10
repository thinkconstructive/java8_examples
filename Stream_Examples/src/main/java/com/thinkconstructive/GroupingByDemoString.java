package com.thinkconstructive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByDemoString {
    public static void main(String args[])
    {
        List<String> listOfNames = new ArrayList<>(Arrays.asList("APJ Kalam", "Bill Gates",
                "Steve Jobs", "APJ Kalam", "Bill Gates",
                "Steve Jobs","APJ Kalam", "Bill Gates",
                "Steve Jobs","Mr Pichai", "Steve Jobs", "Mr Pichai" ));

        Map<String, Long> countOfNames = listOfNames.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );

        countOfNames.forEach((keyOfNames, valueOfCount)-> System.out.println(
                "Occurence of " + keyOfNames.toString() + " is = " + valueOfCount.toString()
        ));
    }
}
