package com.thinkconstructive;

@FunctionalInterface
interface WelcomeWithTwoParam {
    public void welcomeMessage(String messageOne, String messageTwo);
}

public class TwoParam {
    public static void main(String args[])
    {
        //Without Lambda
//        WelcomeWithTwoParam welcomeWithTwoParam = new WelcomeWithTwoParam() {
//            @Override
//            public void welcomeMessage(String messageOne, String messageTwo) {
//                System.out.println("Welcome to " + messageOne + " " + messageTwo);
//            };
//        };

        //With Lambda
//        WelcomeWithTwoParam welcomeWithTwoParam = (messageOne, messageTwo) ->
//            {System.out.println("Welcome to " + messageOne + " " + messageTwo);};

        WelcomeWithTwoParam welcomeWithTwoParam = (messageOne, messageTwo) -> {
            System.out.println("Welcome to " + messageOne + " " + messageTwo);
            System.out.println("This is a Lambda Demo");
        };

        welcomeWithTwoParam.welcomeMessage("Think", "Constructive");
    }
}
