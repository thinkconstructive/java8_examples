package com.thinkconstructive;

@FunctionalInterface
interface WelcomeWithOneParam {
    public void welcomeMessage(String message);
}

public class OneParam {
    public static void main(String args[]) {
        // Without Lambda
//        WelcomeWithOneParam welcomeWithOneParam = new WelcomeWithOneParam() {
//            @Override
//            public void welcomeMessage(String message) {
//                System.out.println("Welcome to " + message);
//            };
//        };

        // Lambda with One Param
        // WelcomeWithOneParam welcomeWithOneParam = (message) -> {System.out.println("Welcome to " + message);};

       // WelcomeWithOneParam welcomeWithOneParam = message -> {System.out.println("Welcome to " + message);};

       // WelcomeWithOneParam welcomeWithOneParam = (message) -> System.out.println("Welcome to " + message);

        WelcomeWithOneParam welcomeWithOneParam = message -> System.out.println("Welcome to " + message);

        welcomeWithOneParam.welcomeMessage("Think Constructive");
}
}
