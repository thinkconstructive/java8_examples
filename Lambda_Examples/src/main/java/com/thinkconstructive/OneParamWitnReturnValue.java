package com.thinkconstructive;

@FunctionalInterface
interface ReturnValExample {
    public String welcomeMessage(String message);
}
public class OneParamWitnReturnValue {
    public static void main(String args[])
    {
        // Without Lambda
//        ReturnValExample returnValExample = new ReturnValExample() {
//            @Override
//            public String welcomeMessage(String message) {
//                return message+"Think Constructive";
//            };
//        };

        // With Lambda
         ReturnValExample returnValExample = (message -> {return message+"Think Constructive";});

        System.out.println( returnValExample.welcomeMessage("Welcome to "));
    }
}
