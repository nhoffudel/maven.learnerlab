package com.github.curriculeon;
import org.junit.Test;
import org.junit.Assert;

public class testInstructor {
    long id = 123;
    String name = "Jose";
    Instructor jose = new Instructor(id, name);
    @Test
    public void testImplementation() {
        Assert.assertEquals(true, jose instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Assert.assertEquals(true, jose instanceof Person);
    }

    @Test
    public void testTeach(){
        Student steve = new Student(789, "Steve");
        double before = steve.getTotalStudyTime();
        int time = 5;
        jose.teach(steve, time);
        Assert.assertEquals(before, steve.getTotalStudyTime(), time);
    }

    @Test
    public void testLecture(){
        Student[] section = {new Student(789, "Steve"), new Student(555, "Joe")};
        double before = section[0].getTotalStudyTime();
        int time = 5;
        jose.lecture(section, time);
        Assert.assertEquals(before, section[0].getTotalStudyTime(), time/section.length);
    }
}
