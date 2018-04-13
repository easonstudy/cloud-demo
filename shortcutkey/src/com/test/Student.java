package com.test;

public class Student extends Teacher{

    private Integer name;

    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }

    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void say() {
        super.say();
    }
}
