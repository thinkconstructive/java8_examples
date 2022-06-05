package com.thinkconstructive;

@FunctionalInterface
interface Welcome {
    public void welcomeMessage();
}

public class NoParam {
    public static void main(String args[])
    {
        // Without Lambda Expression
//        Welcome welcome = new Welcome() {
//            public void welcomeMessage() {System.out.println("Welcome to Think Constructive");};
//        };

        //With Lambda Expression
        Welcome welcome = () -> {System.out.println("Welcome to Think Constructive");};

        welcome.welcomeMessage();
    }
}
