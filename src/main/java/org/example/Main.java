package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person andrei = new Person("Andrei");

        Person ivan = new Person("Ivan");
        Person maria = new Person("Maria");

        Person oleg = new Person("Oleg");
        Person vika = new Person("Vika");

        Person lera = new Person("Lera");
        Person vasya = new Person("Vasya");

        Person karina = new Person("Karina");
        Person dima = new Person("Dima");

        andrei.setFather(oleg);
        andrei.setMother(vika);
        ivan.setMother(vika);
        ivan.setFather(oleg);
        ivan.setSon(dima);
        ivan.setDaughter(karina);
        maria.setFather(vasya);
        maria.setMother(lera);
        maria.setSon(dima);
        maria.setDaughter(karina);


        System.out.println("genealogical tree for Andrei");
        List<Person> listP = ivan.getTreeParents();
        for (Person current : listP) {
            System.out.println(current);
        }


        System.out.println("-------------------------");
//        List<Person> listP1 = maria.getTreeParents();
//
//        for (Person current : listP1) {
//            System.out.println(current);
//        }

    }
}