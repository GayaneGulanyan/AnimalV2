package com.company;

public class Animal implements Action{

    static String name;
    static String family;
    static int age;


}

class Cat extends Animal implements Action{

    void setArg (String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
    void getArg (){
        Action.can();
        Action.mjump(true);
        Action.mbark(false);
        Action.mswim(false);
        Action.mrun(true);
    }
}
class Dog extends Animal {
    void setArg (String name, String family, int age) {
        this.name=name;
        this.family=family;
        this.age=age;
    }
    void getArg (){
        Action.can();
        Action.mjump(true);
        Action.mbark(false);
        Action.mswim(false);
        Action.mrun(true);
    }
}
class Fish extends Animal{
    void setArg (String name, String family, int age) {
        this.name=name;
        this.family=family;
        this.age=age;
    }
    void getArg (){
        Action.can();
        Action.mjump(true);
        Action.mbark(false);
        Action.mswim(false);
        Action.mrun(true);
    }
}


