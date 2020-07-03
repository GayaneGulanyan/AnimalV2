package com.company;

public interface Action {

    static void description(String name, String family, int age){
        System.out.println("It's a " + name +" it is " + family + ", it's age is " + age);
    }
    static void can () {
        System.out.println("It can ");
    }

    static void mjump(boolean jump)
    {
        if (jump){
            System.out.println("Jump ");
        }
    }
    static void mswim(boolean swim) {
        if (swim) {
            System.out.println("Swim ");
        }
    }
    static void mrun(boolean run) {
        if (run) {
            System.out.println("Run ");
        }
    }
    static void mbark(boolean bark) {
        if (bark){
            System.out.println("Bark ");
        }
    }

}
