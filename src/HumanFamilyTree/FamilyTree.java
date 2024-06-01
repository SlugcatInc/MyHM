package HumanFamilyTree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T> implements Serializable, Iterable<T>  {
    private List<Person> members;

    public FamilyTree() {
        members = new ArrayList<>();
    }

    public void addMember(T person) {
        members.add((Person) person);
    }

    public void updateMember(Person person, String name, String gender, int age) {
        person.updatePersonInfo(name, gender, age);
    }
    public void sortPeopleByAge() {
        Collections.sort(members, (p1, p2) -> Integer.compare(((Person<T>) p1).getAge(), ((Person<T>) p2).getAge()));
    }


    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) members;
    }
}