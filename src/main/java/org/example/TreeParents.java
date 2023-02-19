package org.example;

import java.util.ArrayList;
import java.util.List;

public class TreeParents{


//    public TreeParents(Person father, Person mother, Person daughter, Person son) {
//        super(father, mother, daughter, son);
//    }

    public static void TreeParents(Person father, Person mother, Person daughter, Person son) {
        List<Person> parents = new ArrayList<>();
        parents.add(new Person(father, mother, daughter, son));
//        boolean fl = true;

        if (father != null) {
            parents.add(father);
        }

        if (mother != null) {
            parents.add(mother);
        }

        if (son != null) {
            parents.add(son);
        }

        if (daughter != null) {
            parents.add(daughter);
        }

        for (
                int i = 0; i < parents.size(); i++) {
            Person current = parents.get(i);
            Person parentFather = current.getFather();
            Person parentMother = current.getMother();
            Person parentSon = current.getSon();
            Person parentDaughter = current.getDaughter();

            if (parentFather != null) {
                parents.add(parentFather);
            }
            if (parentMother != null) {
                parents.add(parentMother);
            }
            if (parentSon != null) {
                parents.add(parentSon);
            }
            if (parentDaughter != null) {
                parents.add(parentDaughter);
            }
        }
        public TreeParents getTreeParents() {
            return TreeParents;
        }
    }

}


