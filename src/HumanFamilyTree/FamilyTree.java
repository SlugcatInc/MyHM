package HumanFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Person> members;

    public FamilyTree() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void removeMember(Person person) {
        members.remove(person);
    }

    public void updateMember(Person person, String name, String gender, int age) {
        person.updatePersonInfo(name, gender, age);
    }

}