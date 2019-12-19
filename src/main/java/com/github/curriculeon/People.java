package com.github.curriculeon;

import java.util.Iterator;
import java.util.List;

public class People {
    List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).getId() == id) return personList.get(i);
        }
        return null;
    }

    public Boolean contains(Person person){
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).equals(person)) return true;
        }
        return false;
    }

    public void remove(Person person){
        List<Person> personList2 = null;
        for (int i = 0; i < personList.size(); i++){
            if (!personList.get(i).equals(person)) personList2.add(personList.get(i));
        }
        personList = personList2;
    }

    public void remove(long id){
        List<Person> personList2 = null;
        for (int i = 0; i < personList.size(); i++){
            if (!personList.get(i).getID().equals(id)) personList2.add(personList.get(i));
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
        Person answer[] = new Person[personList.size()];
        for (int i = 0; i < personList.size(); i++){
            answer[i] = personList.get(i);
        }
        return answer;
    }

    public Iterator<E> iterator(){
        Iterator<Person> it = new Iterator(personList);
        return it;
    }
}