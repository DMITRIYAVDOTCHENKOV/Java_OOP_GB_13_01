package org.example.seminar3.HW;

import org.example.seminar3.HW.Relation.Type;

import java.util.ArrayList;
import java.util.List;

public class FamilyTreeUtils<T extends Person> {
    private final FamilyTree<T> familyTree;

    public FamilyTreeUtils(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
    }

    public FamilyTree<T> geFamilyTree() {
        return familyTree;
    }

    public void testFillTree() {
        Person person1 = familyTree.addPerson("Дмитрий", "Авдотченков", "Юрьевич", Person.Gender.MALE);
        Person person21 = familyTree.addPerson("Анастасия", "Снегирева", "Сергеевна", Person.Gender.FEMALE);
        Person person22 = familyTree.addPerson("Иван", "Авдотченков", "Иванович", Person.Gender.MALE);
        Person person31 = familyTree.addPerson("Ника", "Печкина", "Ивановна", Person.Gender.FEMALE);
        Person person32 = familyTree.addPerson("Александр", "Снегирев", "Александрович", Person.Gender.MALE);
        Person person33 = familyTree.addPerson("Алиса", "Петрова", "Дмитриевна", Person.Gender.FEMALE);
        Person person34 = familyTree.addPerson("Николай", "Авдотченков", "Николаевич", Person.Gender.MALE);

        familyTree.addRelation(new Relation(person21.id, person1.id, Relation.Type.CHILD));
        familyTree.addRelation(new Relation(person22.id, person1.id, Relation.Type.CHILD));
        familyTree.addRelation(new Relation(person31.id, person21.id, Relation.Type.CHILD));
        familyTree.addRelation(new Relation(person32.id, person21.id, Relation.Type.CHILD));
        familyTree.addRelation(new Relation(person33.id, person22.id, Relation.Type.CHILD));
        familyTree.addRelation(new Relation(person34.id, person22.id, Relation.Type.CHILD));
    }


    public void print() {
        for (Person person : familyTree.getPersons()) {
            System.out.println(person);
        }
    }

    public List<T> FindParents(int id) {
        List<T> res = new ArrayList<>();
        for (Relation relation : familyTree.getRelations()) {
            if (relation.getID1() == id && relation.getTypeID1toID2() == Type.CHILD)
                if (familyTree.getPerson(relation.getID2()) != null)
                    res.add((T) familyTree.getPerson(relation.getID2()));
        }
        return res;
    }

}
