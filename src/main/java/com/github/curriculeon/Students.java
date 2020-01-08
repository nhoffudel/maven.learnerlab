package com.github.curriculeon;

public class Students extends Person{
    private static Student mari = new Student(1,"mari");
    private static Student jef = new Student(2,"jef");
    private static Student bil = new Student(3,"bil");
    final static Student[] instance = {mari, jef, bil};
    private Students() {
    }

    public static Student[] getInstance() {
        return instance;
    }
}
