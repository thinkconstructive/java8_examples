package com.thinkconstructive;

// 4th kind of Method Reference


@FunctionalInterface
interface MRDemoInterface{
    MRDemo printMsg(String msg);
}

class MRDemo{
    public MRDemo(String msg)
    {
        System.out.println(msg);
    }
}

public class MethodReferenceDemoTwo {
    public static void main(String args[])
    {
        MRDemoInterface mrDemoInterface = MRDemo::new;
        mrDemoInterface.printMsg("Java Champion");
    }
}

