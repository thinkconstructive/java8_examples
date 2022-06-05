package com.thinkconstructive;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLambda {
    public static void main(String args[]) {
        List arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        arrayList.forEach((val) -> System.out.println("Val = "+ val.toString()));
    }
}
