package com.thinkconstructive;

import java.util.function.BiFunction;

public class MethodReferenceDemoOne {
    public static <T> T concatOperation(T one, T two, BiFunction<T, T, T> concatenateOp){
        return concatenateOp.apply(one, two);
    }

    public static String concatNames(String one, String two)
    {
        return one + two;
    }

    public String concatNamesForInstance(String one, String two)
    {
        return one + two;
    }

    public static void main(String args[])
    {
        MethodReferenceDemoOne methodReferenceDemoOne = new MethodReferenceDemoOne();

        // With Lambda Expression
        System.out.println(MethodReferenceDemoOne.concatOperation(
                "Head","First",(nameOne, nameTwo) -> nameOne + nameTwo
        ));

        //Without Lambda Exp  -  With Method References
        System.out.println(MethodReferenceDemoOne.concatOperation(
                "Java","Black", MethodReferenceDemoOne::concatNames
        ));

        //Without Lambda Exp  - With Method References - Instance Method
        System.out.println(MethodReferenceDemoOne.concatOperation(
                "Oracle", "Java",methodReferenceDemoOne::concatNamesForInstance
        ));

        //Without Lambda Exp  - With Method References -

    }
}
