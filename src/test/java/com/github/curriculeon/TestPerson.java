package com.github.curriculeon;
import org.junit.Assert;
import org.junit.Test;

public class testPerson {
    @Test
    public void testConstructor() {
        long id = 123;
        String name = "Jeff";
        Person jeff = new Person(id, name);
        Assert.assertEquals(id, jeff.getId());
        Assert.assertEquals(name, jeff.getName());
    }

    @Test
    public void testName() {
        long id = 123;
        String name = "Bob";
        Person bob = new Person(id, name);
        Assert.assertEquals(name, bob.getName());
    }

}
