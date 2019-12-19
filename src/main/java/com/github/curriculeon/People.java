package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;

public class People {
    List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person : personList) {
            if (person.getId() == id) return person;
        }
        return null;
    }

    public Boolean contains(Person person){
        for (Person value : personList) {
            if (value.equals(person)) return true;
        }
        return false;
    }

    public void remove(Person person){
        List<Person> personList2 = null;
        for (Person value : personList) {
            if (!value.equals(person)) personList2.add(value);
        }
        personList = personList2;
    }

    public void remove(long id){
        List<Person> personList2 = null;
        for (Person person : personList) {
            if (!person.getID().equals(id)) personList2.add(person);
        }
        personList = personList2;
    }

    public void removeAll(){
        personList = null;
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] answer = new Person[personList.size() - 1];
        for (int i = 0; i < personList.size(); i++){
            answer[i] = personList.get(i);
        }
        return answer;
    }

    public Iterator<Person> iterator(){
        return personList.iterator();
    }
}