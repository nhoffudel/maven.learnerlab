package com.github.curriculeon;
import org.junit.Test;
import org.junit.Assert;

public class testStudent {
    long id = 123;
    String name = "Jeff";
    Student jeff = new Student(id, name);
    @Test
    public void testImplementation() {
        Assert.assertEquals(true, jeff instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Assert.assertEquals(true, jeff instanceof Person);
    }

    @Test
    public void testLearn() {
        double jeffshours = jeff.getTotalStudyTime();
        int inc = 5;
        jeff.learn(inc);
        Assert.assertEquals(jeffshours, jeff.getTotalStudyTime(), inc);
    }
}
