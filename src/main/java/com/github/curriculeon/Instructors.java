package com.github.curriculeon;

public class Instructors extends Person {
    private static Instructor lou = new Instructor(4,"lou");
    private static Instructor kim = new Instructor(5,"kim");
    private static Instructor darquan = new Instructor(6,"darquan");
    final static Instructor[] instance = {lou, kim, darquan};
    private Instructors() {
    }

    public static Instructor[] getInstance() {
        return instance;
    }
}
