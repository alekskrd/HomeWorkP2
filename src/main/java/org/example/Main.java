package org.example;
/*1) У Вас сейчас интерфейс используется не правильно. В интерфейсе могут быть либо методы, которые нужно реализовать, либо методы default.
В Вашем интерфейсе TreeParents отсутствует.
2) Создайте класс TreeParentsImpl - реализуйте этим классом метод интерфейса TreeParents -> getTreeParents(), только сделайте его не статичным,
 а в методе main при его вызове создавайте объект этого класса.
В интерфейсе TreeParents -> void getTreeParents(Person father, Person mother, Person daughter, Person son);*/

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan");
        Person maria = new Person("Maria");

        Person oleg = new Person("Oleg");
        Person vika = new Person("Vika");

        Person lera = new Person("Lera");
        Person vasya = new Person("Vasya");

        Person karina = new Person("Karina");
        Person dima = new Person("Dima");

        System.out.println("genealogical tree for Andrei");




        TreeParentsImpl treeParents= new TreeParentsImpl(vasya,vika);
        System.out.println(treeParents);

    }
}




