package org.example.seminar3.HW;


import org.example.seminar3.HW.Relation.Type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class FamilyTree<T extends Person> {
    private final HashMap<Integer, T> persons;
    private final ArrayList<Relation> relations;
    private int id_counter;
    private T peron;

    public FamilyTree(T peron) {
        persons = new HashMap<>();
        relations = new ArrayList<>();
        id_counter = 0;
    }

    public void save(String file_path) {
        try (DataOutputStream ds = new DataOutputStream(new FileOutputStream(file_path))) {
            ds.writeInt(persons.size());
            for (T it : persons.values()) {
                it.save(ds);
            }
            ds.writeInt(relations.size());
            for (Relation it : relations) {
                it.save(ds);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


    public void load(String file_path) {
        try (DataInputStream ds = new DataInputStream(new FileInputStream(file_path))) {
            persons.clear();
            relations.clear();
            int count = ds.readInt();
            for (int i = 0; i < count; i++) {
                Person person = new Person(0);
                person.load(ds);
                persons.put(person.get_id(), (T) person);
            }

            count = ds.readInt();
            for (int i = 0; i < count; i++) {
                Relation relation = new Relation(0, 0, Type.CHILD);
                relation.load(ds);
                relations.add(relation);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Person addPerson(String name, String family, String middle_name, Person.Gender gender) {
        // #region Получим уникальный ID
        while (persons.containsKey(id_counter))
            id_counter++;
        // #endregion
        Person person = new Person(id_counter, name, family, middle_name, gender);
        persons.put(id_counter, (T) person);
        return person;
    }


    public boolean deletePerson(int id) {
        if (persons.containsKey(id) == false)
            return false;
        persons.remove(id);
        return true;
    }

    public Person getPerson(int id) {
        if (persons.containsKey(id) == false)
            return null;
        return persons.get(id);
    }


    public List<Person> findPersonID(String name, String family, String middle_name) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.name.equals(name) && person.family.equals(family) && person.middle_name.equals(middle_name)) {
                res.add(person);
            }
        }
        return res;
    }


    public Collection<T> getPersons() {
        return (Collection<T>) persons.values();
    }

    public boolean addRelation(Relation relation) {
        for (Relation it : relations) {
            if (it.equals(relation))
                return true;
            if (it.getID1() == relation.getID1() && it.getID2() == relation.getID2())
                return false; // уже есть связь
            if (it.getID1() == relation.getID2() && it.getID2() == relation.getID1())
                return false; // уже есть связь
        }
        relations.add(relation);
        return true;
    }


    public boolean deleteRelation(int id1, int id2) {
        for (int i = 0; i < relations.size(); i++) {
            if ((relations.get(i).getID1() == id1 && relations.get(i).getID2() == id2) ||
                    (relations.get(i).getID1() == id2 && relations.get(i).getID2() == id1)) {
                relations.remove(i);
                return true;
            }

        }
        return false;
    }

    public ArrayList<Relation> getRelations() {
        return (ArrayList<Relation>) relations.clone();
    }
}