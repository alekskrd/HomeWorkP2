package org.example;



import java.util.List;

public class Person extends TreeParents{

    private Person father;
    private Person mother;
    private Person son;
    private Person daughter;
    private String name;


    public Person(Person father, Person mother, Person daughter, Person son) {
        this.father = father;
        this.mother = mother;
        this.son = son;
        this.daughter = daughter;
    }

    public Person(String andrei) {
        super();
    }

//    public Person(String andrei) {
//        super();
//    }


    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getSon() {
        return son;
    }

    public Person getDaughter() {
        return daughter;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setSon(Person son) {
        this.son = son;
    }

    public void setDaughter(Person daughter) {
        this.daughter = daughter;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}



